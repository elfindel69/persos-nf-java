package inc.cwg.persos_nf.service;

import inc.cwg.persos_nf.models.SigneDistinctif;

import java.util.List;

public interface SigneDistinctifService {
    SigneDistinctif ajouterSigneDistinctif(String nom);

    List<SigneDistinctif> recupererSignesDistinctifs();

    SigneDistinctif recupererSigneDistinctif(long id);

    SigneDistinctif enregistrerSigneDistinctif(SigneDistinctif sd);
}
