package inc.cwg.persos_nf.dao;

import inc.cwg.persos_nf.models.TraitCaractere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "traitsCaracteres")
public interface TraitCaractereDAO extends JpaRepository<TraitCaractere,Long> {
}
