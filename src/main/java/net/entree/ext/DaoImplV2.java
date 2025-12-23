package net.entree.ext;
import net.entree.dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Capteur");
        return 60;
    }
}