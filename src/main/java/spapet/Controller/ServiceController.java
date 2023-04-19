package spapet.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spapet.Model.SpaService;
import spapet.Respository.SpaServiceRepository;
import spapet.Service.ServiceService;

import javax.management.relation.RelationNotFoundException;
import java.util.List;

@RestController
@RequestMapping(path = "/serviceList", produces = "application/json")
public class ServiceController {
    @Autowired
    private ServiceService serviceService;
    @GetMapping
    public List<SpaService> getAllServices() {
        return serviceService.getList();
    }

    @GetMapping("/{id}")
    public SpaService getProductById(@PathVariable Long id) throws RelationNotFoundException {
        return serviceService.getById(id);
    }
}
