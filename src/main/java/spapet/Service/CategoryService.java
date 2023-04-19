package spapet.Service;

import org.springframework.stereotype.Service;
import spapet.Model.Category;
import spapet.Respository.CategoryRepository;

import javax.management.relation.RelationNotFoundException;
import java.util.Optional;
@Service
public class CategoryService {
    private CategoryRepository categoryRepo;
    public Category getById(long id) throws RelationNotFoundException {
        Optional<Category> optional = categoryRepo.findById(id);
        return optional.orElseThrow(() -> new RelationNotFoundException("Service is not found"));
    }
}
