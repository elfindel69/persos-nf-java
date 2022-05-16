package inc.cwg.persos_nf.service;

import inc.cwg.persos_nf.models.Lien;
import inc.cwg.persos_nf.models.Personnage;

import java.util.List;

public interface LienService {
    Lien ajouterLien(String type, Personnage cible);

    List<Lien> recupererLiens();

    Lien recupererLien(long id);
}
