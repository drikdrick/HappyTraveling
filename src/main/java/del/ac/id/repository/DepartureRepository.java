package del.ac.id.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import del.ac.id.model.Departure;

@Repository
public interface DepartureRepository extends JpaRepository<Departure, Long>{

	
}
