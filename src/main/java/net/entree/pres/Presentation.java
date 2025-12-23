package net.entree.pres;

import net.entree.dao.DaoImpl;
import net.entree.metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        // Injection des dépendances par instanciation statique (new)
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao); // Injection via constructeur
        // metier.setDao(dao); // Si injection via Setter

        System.out.println("Résultat = " + metier.calcul());
    }
}