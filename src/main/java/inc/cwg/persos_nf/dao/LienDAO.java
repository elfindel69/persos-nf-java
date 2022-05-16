package inc.cwg.persos_nf.dao;

import inc.cwg.persos_nf.models.Lien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "liens")
public interface LienDAO extends JpaRepository<Lien,Long> {
}
