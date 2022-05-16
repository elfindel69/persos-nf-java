package inc.cwg.persos_nf.dao;

import inc.cwg.persos_nf.models.Parcours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "parcours")
public interface ParcoursDAO extends JpaRepository<Parcours,Long> {
}
