package Tourisme.ml.tourismemali.Repository;

import Tourisme.ml.tourismemali.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository

public interface UsersRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByNomUtilisateur(String nomUtilisateur);
}
