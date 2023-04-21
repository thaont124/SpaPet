//package spapet.Respository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import spapet.Model.Category;
//import spapet.Model.Category_SpaService;
//import spapet.Model.SpaService;
//
//import java.util.List;
//
//public interface CategorySpaServiceRepository extends JpaRepository<Category_SpaService, Long> {
//    List<Category_SpaService> findByCategory(Category category);
//    List<Category_SpaService> findBySpaservice(SpaService spaService);
//}
package spapet.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import spapet.Model.Category_SpaService;

public interface CategorySpaServiceRepository extends JpaRepository<Category_SpaService, Long> {
//    @Query("SELECT e FROM Employee e WHERE e.department.id = :departmentId")
//    List<Employee> findByDepartmentId(@Param("departmentId") Long departmentId);
}