package spapet.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import spapet.Model.SpaService;

public interface SpaServiceRepository extends JpaRepository<SpaService, Long> {
}