package net.entree.dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Base de Données");
        double temp = Math.random() * 40;
        return temp;
    }
}