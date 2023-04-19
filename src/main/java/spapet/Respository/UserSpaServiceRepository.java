package spapet.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import spapet.Model.User_SpaService;

public interface UserSpaServiceRepository extends JpaRepository<User_SpaService, Long> {
}