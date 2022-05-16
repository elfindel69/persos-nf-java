package inc.cwg.persos_nf.dao;

import inc.cwg.persos_nf.models.SigneDistinctif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "signesDistinctifs")
public interface SigneDistinctifDAO extends JpaRepository<SigneDistinctif,Long> {
}
