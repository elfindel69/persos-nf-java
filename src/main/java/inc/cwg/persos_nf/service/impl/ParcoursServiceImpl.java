package inc.cwg.persos_nf.service.impl;

import inc.cwg.persos_nf.dao.ParcoursDAO;
import inc.cwg.persos_nf.models.Parcours;
import inc.cwg.persos_nf.service.ParcoursService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParcoursServiceImpl implements ParcoursService {
    private final ParcoursDAO parcoursDAO;

    public ParcoursServiceImpl(ParcoursDAO parcoursDAO) {
        this.parcoursDAO = parcoursDAO;
    }

    @Override
    public Parcours ajouterParcours(String nom, int anneeAD, int anneeIC) {
        return parcoursDAO.save(new Parcours(nom,anneeAD,anneeIC));
    }

    @Override
    public List<Parcours> recupererAllParcours() {
        return parcoursDAO.findAll();
    }

    @Override
    public Parcours recupererParcoursById(long id) {
        return parcoursDAO.getById(id);
    }
}
