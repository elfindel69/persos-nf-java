package inc.cwg.persos_nf.service;

import inc.cwg.persos_nf.models.TraitCaractere;

import java.util.List;

public interface TraitCaractereService {
    TraitCaractere ajouterTraitCaractere(String nom);

    List<TraitCaractere> recupererTraitsCaractere();

    TraitCaractere recupererTraitCaractere(long id);

    TraitCaractere enregistrerTraitCaractere(TraitCaractere tc);
}
