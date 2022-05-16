package inc.cwg.persos_nf.dao;

import inc.cwg.persos_nf.models.Hobby;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "hobbies")
public interface HobbyDAO extends JpaRepository<Hobby,Long> {
}
