package inc.cwg.persos_nf.service.impl;

import inc.cwg.persos_nf.dao.PersonnageDAO;
import inc.cwg.persos_nf.models.Personnage;
import inc.cwg.persos_nf.service.PersonnageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnageServiceImpl implements PersonnageService {
    private final PersonnageDAO personnageDAO;

    public PersonnageServiceImpl(PersonnageDAO personnageDAO) {
        this.personnageDAO = personnageDAO;
    }

    @Override
    public Personnage enregisterPersonnage(Personnage personnage) {
        return personnageDAO.save(personnage);
    }

    @Override
    public List<Personnage> recupererPersonnages() {
        return personnageDAO.findAll();
    }

    @Override
    public Personnage recupererPersonnage(long id) {
        return personnageDAO.getById(id);
    }

    @Override
    public boolean supprimerPersonnage(long id) {
        Personnage personne = recupererPersonnage(id);
        if(personne == null){
            return false;
        }else {
            personnageDAO.deleteById(id);
            return recupererPersonnage(id) == null;
        }
    }
}
