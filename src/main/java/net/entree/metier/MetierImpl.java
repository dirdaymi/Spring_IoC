package net.entree.metier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.entree.dao.IDao;

@Service("metier")
public class MetierImpl implements IMetier {

    // @Autowired // Injection via attribut (déconseillé mais possible)
    private IDao dao;

    @Autowired // Injection via constructeur (recommandé)
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        return dao.getData() * 2; // Exemple calcul
    }
}