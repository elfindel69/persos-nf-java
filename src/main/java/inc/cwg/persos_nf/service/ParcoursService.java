package inc.cwg.persos_nf.service;

import inc.cwg.persos_nf.models.Parcours;

import java.util.List;

public interface ParcoursService {
    Parcours ajouterParcours(String nom, int anneeAD, int anneeIC );

    List<Parcours> recupererAllParcours();

    Parcours recupererParcoursById(long id);
}
