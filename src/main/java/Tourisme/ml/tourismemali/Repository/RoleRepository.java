package Tourisme.ml.tourismemali.Repository;

import Tourisme.ml.tourismemali.Models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RoleRepository extends JpaRepository<Roles, Long> {
}
