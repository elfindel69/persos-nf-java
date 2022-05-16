package inc.cwg.persos_nf.service.impl;

import inc.cwg.persos_nf.dao.LienDAO;
import inc.cwg.persos_nf.models.Lien;
import inc.cwg.persos_nf.models.Personnage;
import inc.cwg.persos_nf.service.LienService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LienServiceImpl implements LienService {
    private final LienDAO lienDAO;


    public LienServiceImpl(LienDAO lienDAO) {
        this.lienDAO = lienDAO;
    }

    @Override
    public Lien ajouterLien(String type, Personnage cible) {
        return lienDAO.save(new Lien(type,cible));
    }

    @Override
    public List<Lien> recupererLiens() {
        return lienDAO.findAll();
    }

    @Override
    public Lien recupererLien(long id) {
        return lienDAO.getById(id);
    }
}
