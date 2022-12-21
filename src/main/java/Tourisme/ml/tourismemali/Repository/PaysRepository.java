package Tourisme.ml.tourismemali.Repository;

import Tourisme.ml.tourismemali.Models.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PaysRepository extends JpaRepository<Pays, Long> {
    Pays findByNom(String nom);

    Pays findByCode(String code);
}
