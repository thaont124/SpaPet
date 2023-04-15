package spapet.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import spapet.Model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}