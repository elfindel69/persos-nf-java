package inc.cwg.persos_nf.service.impl;

import inc.cwg.persos_nf.dao.TraitCaractereDAO;
import inc.cwg.persos_nf.models.TraitCaractere;
import inc.cwg.persos_nf.service.TraitCaractereService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraitCaractereServiceImpl implements TraitCaractereService {
    private final TraitCaractereDAO traitCaractereDAO;


    public TraitCaractereServiceImpl(TraitCaractereDAO traitCaractereDAO) {
        this.traitCaractereDAO = traitCaractereDAO;
    }

    @Override
    public TraitCaractere ajouterTraitCaractere(String nom) {
        return traitCaractereDAO.save(new TraitCaractere(nom));
    }

    @Override
    public List<TraitCaractere> recupererTraitsCaractere() {
        return traitCaractereDAO.findAll();
    }

    @Override
    public TraitCaractere recupererTraitCaractere(long id) {
        return traitCaractereDAO.getById(id);
    }

    @Override
    public TraitCaractere enregistrerTraitCaractere(TraitCaractere tc) {
        return traitCaractereDAO.save(tc);
    }
}
