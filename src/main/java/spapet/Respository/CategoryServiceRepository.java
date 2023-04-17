package spapet.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import spapet.Model.Category_Spaservice;

public interface CategoryServiceRepository extends JpaRepository<Category_Spaservice, Long> {
}