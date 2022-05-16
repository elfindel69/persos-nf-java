package inc.cwg.persos_nf.service.impl;

import inc.cwg.persos_nf.dao.LieuDAO;
import inc.cwg.persos_nf.models.Lieu;
import inc.cwg.persos_nf.service.LieuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LieuServiceImpl implements LieuService {
    private final LieuDAO lieuDAO;

    public LieuServiceImpl(LieuDAO lieuDAO) {
        this.lieuDAO = lieuDAO;
    }


    @Override
    public Lieu ajouterLieu(String ville, String etat, String systeme, String pays) {
        return lieuDAO.save(new Lieu(ville,etat,systeme,pays));
    }

    @Override
    public List<Lieu> recupererLieux() {
        return lieuDAO.findAll();
    }

    @Override
    public Lieu recupererLieu(long id) {
        return lieuDAO.getById(id);
    }
}
