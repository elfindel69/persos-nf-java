package inc.cwg.persos_nf.dao;

import inc.cwg.persos_nf.models.Personnage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonnageDAO extends JpaRepository<Personnage,Long> {
}
