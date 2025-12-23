package net.entree.metier;

import net.entree.dao.IDao;

public class MetierImpl implements IMetier {
    // Couplage faible : on dépend de l'interface
    private IDao dao;

    // Injection via le constructeur (recommandé)
    // On peut aussi mettre un constructeur sans paramètre + setter
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {} // Nécessaire pour l'instanciation dynamique plus tard

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp * 540 / Math.cos(tmp * Math.PI);
        return res;
    }
}