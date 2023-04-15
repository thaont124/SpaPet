package spapet.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import spapet.Model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
}