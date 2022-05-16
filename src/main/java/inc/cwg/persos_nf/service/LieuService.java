package inc.cwg.persos_nf.service;



import inc.cwg.persos_nf.models.Lieu;

import java.util.List;

public interface LieuService {

    Lieu ajouterLieu(String ville, String etat, String systeme, String pays);

    List<Lieu> recupererLieux();

    Lieu recupererLieu(long id);
}
