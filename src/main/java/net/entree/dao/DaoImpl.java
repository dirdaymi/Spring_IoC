package net.entree.dao;
import org.springframework.stereotype.Repository;

@Repository("dao") // @Component marche aussi
public class DaoImpl implements IDao {

    @Override
    public double getData() {
        System.out.println("Version Base de Données");
        return Math.random() * 40;
    }
}