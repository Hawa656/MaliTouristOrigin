package Tourisme.ml.tourismemali.Repository;

import Tourisme.ml.tourismemali.Models.Region;
import Tourisme.ml.tourismemali.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface RegionRepository extends JpaRepository<Region, Long> {
    Region findByNom(String nom);

    Region findByCode(String code);

    // liste des regions sans pays
    @Query(value = "SELECT code, nom, superficie, domaine_activite, langue FROM Region", nativeQuery = true)
    List<Object> RegionsSansPays();
}
