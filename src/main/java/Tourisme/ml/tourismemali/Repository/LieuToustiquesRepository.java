package Tourisme.ml.tourismemali.Repository;

import Tourisme.ml.tourismemali.Models.LieuTouristiques;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LieuToustiquesRepository extends JpaRepository<LieuTouristiques, Long> {
}
