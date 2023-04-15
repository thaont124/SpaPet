package spapet.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import spapet.Model.User_Service;

public interface UserServiceRepository extends JpaRepository<User_Service, Long> {
}