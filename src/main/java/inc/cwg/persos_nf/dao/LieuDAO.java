package inc.cwg.persos_nf.dao;

import inc.cwg.persos_nf.models.Lieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "lieux")
public interface LieuDAO extends JpaRepository<Lieu,Long> {
}
