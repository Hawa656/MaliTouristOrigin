package Tourisme.ml.tourismemali.Repository;

import Tourisme.ml.tourismemali.Models.DomaineActivite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Domaine_activiteRepository extends JpaRepository<DomaineActivite, Long> {
    DomaineActivite findByNom(String nom);

    DomaineActivite findByCode(String code);
}
