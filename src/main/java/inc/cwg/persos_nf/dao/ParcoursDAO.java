package inc.cwg.persos_nf.dao;

import inc.cwg.persos_nf.models.Parcours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcoursDAO extends JpaRepository<Parcours,Long> {
}
