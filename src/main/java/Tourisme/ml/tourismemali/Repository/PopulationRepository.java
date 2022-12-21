package Tourisme.ml.tourismemali.Repository;

import Tourisme.ml.tourismemali.Models.Population;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PopulationRepository extends JpaRepository<Population, Long> {
    Population findByCode(Long code);
}
