package net.entree.pres;

import net.entree.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        // Scan des packages pour trouver les annotations @Component, @Service, etc.
        ApplicationContext context = new AnnotationConfigApplicationContext("net.entree.dao", "net.entree.metier");

        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Résultat => " + metier.calcul());
    }
}