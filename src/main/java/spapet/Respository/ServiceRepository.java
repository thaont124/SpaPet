package spapet.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import spapet.Model.Service;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}