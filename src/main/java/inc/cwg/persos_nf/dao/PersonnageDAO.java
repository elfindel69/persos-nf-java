package inc.cwg.persos_nf.dao;

import inc.cwg.persos_nf.models.Personnage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "personnages")
public interface PersonnageDAO extends JpaRepository<Personnage,Long> {
}
