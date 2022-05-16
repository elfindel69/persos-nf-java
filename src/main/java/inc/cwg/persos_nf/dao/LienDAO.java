package inc.cwg.persos_nf.dao;

import inc.cwg.persos_nf.models.Lien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LienDAO extends JpaRepository<Lien,Long> {
}
