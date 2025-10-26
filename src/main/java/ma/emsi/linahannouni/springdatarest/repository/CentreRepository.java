package ma.emsi.linahannouni.springdatarest.repository;

import ma.emsi.linahannouni.springdatarest.model.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface CentreRepository extends JpaRepository<Centre, Long> {
}
