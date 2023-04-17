package spapet.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import spapet.Model.Spaservice;

public interface ServiceRepository extends JpaRepository<Spaservice, Long> {
}