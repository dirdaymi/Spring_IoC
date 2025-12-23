package net.entree.pres;

import net.entree.dao.IDao;
import net.entree.metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws Exception {

        // 1. Lecture du fichier de configuration
        Scanner scanner = new Scanner(new File("config.txt"));

        // 2. Instanciation dynamique de la DAO
        String daoClassName = scanner.next();
        Class<?> cDao = Class.forName(daoClassName); // Ajout de <?>
        // Utilisation de getDeclaredConstructor().newInstance() au lieu de newInstance()
        IDao dao = (IDao) cDao.getDeclaredConstructor().newInstance();
        System.out.println("Classe DAO instanciée : " + dao.getClass().getName());

        // 3. Instanciation dynamique du Métier
        String metierClassName = scanner.next();
        Class<?> cMetier = Class.forName(metierClassName); // Ajout de <?>
        IMetier metier = (IMetier) cMetier.getDeclaredConstructor().newInstance();

        // 4. Injection de dépendance
        Method method = cMetier.getMethod("setDao", IDao.class);
        method.invoke(metier, dao);

        // 5. Test
        System.out.println("Résultat = " + metier.calcul());

        scanner.close(); // Bonne pratique : fermer le scanner
    }
}