package spapet.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import spapet.Model.Category;

import java.util.*;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Query("SELECT d.id AS departmentid, e.id AS employeeid FROM Category d LEFT JOIN FETCH d.service e")
    List<Map<String, Object>> ahihi();
}