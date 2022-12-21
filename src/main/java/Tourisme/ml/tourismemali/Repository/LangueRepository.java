package Tourisme.ml.tourismemali.Repository;

import Tourisme.ml.tourismemali.Models.Langues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LangueRepository extends JpaRepository<Langues, Long> {
    Langues findByLibele(String nom);

    Langues findByCode(String code);
}
