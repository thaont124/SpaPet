//package spapet.Service;
//
//import org.springframework.stereotype.Service;
//import spapet.DTO.CategoryDTO;
//import spapet.DTO.SpaServiceDTO;
//import spapet.Model.Category;
//import spapet.Model.Category_SpaService;
//import spapet.Model.SpaService;
//import spapet.Respository.CategorySpaServiceRepository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class CategoryServiceService {
//
//    private CategorySpaServiceRepository cateServiceRepo;
//
//    public CategoryServiceService(CategorySpaServiceRepository cateServiceRepo) {
//        this.cateServiceRepo = cateServiceRepo;
//    }
//
//    public List<SpaServiceDTO> getByCategory(Category category) {
//        List<Category_SpaService> categoryServices = cateServiceRepo.findByCategory(category);
//        List<SpaService> spaServices = new ArrayList<>();
//
//        for (Category_SpaService categoryService : categoryServices) {
//            spaServices.add(categoryService.getService());
//        }
//
//        return spaServices.stream()
//                .map(this::convertToDTO)
//                .collect(Collectors.toList());
//    }
//
//    public List<CategoryDTO> getByService(SpaService spaService) {
//        List<Category_SpaService> categoryServices = cateServiceRepo.findBySpaservice(spaService);
//        List<Category> categories = new ArrayList<>();
//        for (Category_SpaService categorySpaservice : categoryServices) {
//            categories.add(categorySpaservice.getCategory());
//        }
//        return categories.stream()
//                .map(this::convertToDTO)
//                .collect(Collectors.toList());
//    }
//
//    private SpaServiceDTO convertToDTO(SpaService service) {
//        return new SpaServiceDTO(service.getId(), service.getName(), service.getDescription(), service.getAppointmentTime(), service.getFinishServTime());
//
//    }
//
//    private CategoryDTO convertToDTO(Category category) {
//        return new CategoryDTO(category.getId(), category.getName());
//    }
//}
