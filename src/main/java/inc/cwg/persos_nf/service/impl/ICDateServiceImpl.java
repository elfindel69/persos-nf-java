package inc.cwg.persos_nf.service.impl;

import inc.cwg.persos_nf.dao.ICDateDAO;
import inc.cwg.persos_nf.models.ICDate;
import inc.cwg.persos_nf.service.ICDateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ICDateServiceImpl implements ICDateService {
    private final ICDateDAO icDateDAO;


    public ICDateServiceImpl(ICDateDAO icDateDAO) {
        this.icDateDAO = icDateDAO;
    }

    @Override
    public ICDate ajouterDate(int annee, int mois, int jour) {
        return icDateDAO.save(new ICDate(annee,mois,jour));
    }

    @Override
    public List<ICDate> recupererDates() {
        return icDateDAO.findAll();
    }

    @Override
    public ICDate recupererDate(long id) {
        return icDateDAO.getById(id);
    }
}
