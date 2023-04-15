package spapet.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import spapet.Model.User_Role;

public interface UserRoleRepository extends JpaRepository<User_Role, Long> {
}