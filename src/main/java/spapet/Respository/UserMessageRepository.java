package spapet.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import spapet.Model.User_Message;

public interface UserMessageRepository extends JpaRepository<User_Message, Long> {
}