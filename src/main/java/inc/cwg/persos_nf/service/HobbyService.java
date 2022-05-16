package inc.cwg.persos_nf.service;

import inc.cwg.persos_nf.models.Hobby;

import java.util.List;

public interface HobbyService {

    Hobby ajouterHobby(String nom);

    List<Hobby> recupererHobbies();

    Hobby recupererHobby(long id);

    Hobby enregistrerHobby(Hobby h);
}
