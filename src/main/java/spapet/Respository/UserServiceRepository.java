package spapet.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import spapet.Model.User_Spaservice;

public interface UserServiceRepository extends JpaRepository<User_Spaservice, Long> {
}