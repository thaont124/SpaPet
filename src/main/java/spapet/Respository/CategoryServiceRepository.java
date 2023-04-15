package spapet.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import spapet.Model.Category_Service;

public interface CategoryServiceRepository extends JpaRepository<Category_Service, Long> {
}