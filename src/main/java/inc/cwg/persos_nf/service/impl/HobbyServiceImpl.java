package inc.cwg.persos_nf.service.impl;

import inc.cwg.persos_nf.dao.HobbyDAO;
import inc.cwg.persos_nf.models.Hobby;
import inc.cwg.persos_nf.service.HobbyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HobbyServiceImpl implements HobbyService {
    private final HobbyDAO hobbyDAO;


    public HobbyServiceImpl(HobbyDAO hobbyDAO) {
        this.hobbyDAO = hobbyDAO;
    }

    @Override
    public Hobby ajouterHobby(String nom) {
        Hobby hobby = new Hobby(nom);
        return hobbyDAO.save(hobby);
    }

    @Override
    public List<Hobby> recupererHobbies() {
        return hobbyDAO.findAll();
    }

    @Override
    public Hobby recupererHobby(long id) {
        return hobbyDAO.getById(id);
    }

    @Override
    public Hobby enregistrerHobby(Hobby h) {
        return hobbyDAO.save(h);
    }
}

