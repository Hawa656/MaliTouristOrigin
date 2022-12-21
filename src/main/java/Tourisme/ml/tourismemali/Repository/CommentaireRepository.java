package Tourisme.ml.tourismemali.Repository;

import Tourisme.ml.tourismemali.Models.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {
}
