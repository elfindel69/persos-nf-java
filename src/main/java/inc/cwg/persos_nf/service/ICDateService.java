package inc.cwg.persos_nf.service;

import inc.cwg.persos_nf.models.ICDate;

import java.util.List;

public interface ICDateService {
    ICDate ajouterDate(int annee, int mois, int jour);

    List<ICDate> recupererDates();

    ICDate recupererDate(long id);
}
