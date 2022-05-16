package inc.cwg.persos_nf.service.impl;

import inc.cwg.persos_nf.dao.SigneDistinctifDAO;
import inc.cwg.persos_nf.models.SigneDistinctif;
import inc.cwg.persos_nf.service.SigneDistinctifService;

import java.util.List;

public class SigneDistinctifServiceImpl implements SigneDistinctifService {
    private final SigneDistinctifDAO signeDistinctifDAO;

    public SigneDistinctifServiceImpl(SigneDistinctifDAO signeDistinctifDAO) {
        this.signeDistinctifDAO = signeDistinctifDAO;
    }

    @Override
    public SigneDistinctif ajouterSigneDistinctif(String nom) {
        return signeDistinctifDAO.save(new SigneDistinctif(nom));
    }

    @Override
    public List<SigneDistinctif> recupererSignesDistinctifs() {
        return signeDistinctifDAO.findAll();
    }

    @Override
    public SigneDistinctif recupererSigneDistinctif(long id) {
        return signeDistinctifDAO.getById(id);
    }

    @Override
    public SigneDistinctif enregistrerSigneDistinctif(SigneDistinctif sd) {
        return signeDistinctifDAO.save(sd);
    }
}
