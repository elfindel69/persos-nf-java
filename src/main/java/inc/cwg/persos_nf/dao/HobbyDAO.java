package inc.cwg.persos_nf.dao;

import inc.cwg.persos_nf.models.Hobby;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HobbyDAO extends JpaRepository<Hobby,Long> {
}
