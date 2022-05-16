package inc.cwg.persos_nf.dao;

import inc.cwg.persos_nf.models.ICDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "icDates")
public interface ICDateDAO extends JpaRepository<ICDate,Long> {
}
