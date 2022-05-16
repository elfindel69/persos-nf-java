package inc.cwg.persos_nf.service;

import inc.cwg.persos_nf.models.Personnage;

import java.util.List;

public interface PersonnageService {
    Personnage enregisterPersonnage(Personnage personnage);
    List<Personnage> recupererPersonnages();
    Personnage recupererPersonnage(long id);
    boolean supprimerPersonnage(long id);
}
