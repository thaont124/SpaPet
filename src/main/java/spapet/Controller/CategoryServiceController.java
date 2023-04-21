package spapet.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spapet.Model.SpaService;
import spapet.Service.CategoryService;
import spapet.Service.CategoryServiceService;
import spapet.Service.ServiceService;

import javax.management.relation.RelationNotFoundException;

@RestController
@RequestMapping(path = "categoryService")
public class CategoryServiceController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ServiceService serviceService;
    @Autowired
    private CategoryServiceService categoryServiceService;



}
