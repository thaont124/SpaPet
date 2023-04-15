package spapet.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import spapet.Model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}