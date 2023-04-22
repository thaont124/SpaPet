package spapet.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spapet.DTO.SpaServiceDTO;
import spapet.Model.SpaService;
import spapet.Respository.SpaServiceRepository;
import spapet.Service.ServiceService;

import javax.management.relation.RelationNotFoundException;
import java.util.List;

@RestController
@RequestMapping(path = "/api/serviceList", produces = "application/json")
public class ServiceController {
    @Autowired
    private ServiceService serviceService;
    @GetMapping
    public ResponseEntity<List<SpaServiceDTO>> getAllServices() {
        return serviceService.getList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SpaServiceDTO> getServiceById(@PathVariable Long id) throws RelationNotFoundException {
        return serviceService.getById(id);
    }

    @PostMapping("/create")
    public ResponseEntity<SpaService> createService(@RequestBody SpaServiceDTO serviceDTO){
        SpaService newService = serviceService.addService(serviceDTO);
        return new ResponseEntity<>(newService, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteService(@RequestBody SpaServiceDTO serviceDTO){
        serviceService.deleteService(serviceDTO);
        return new ResponseEntity<>("Đã xóa thành công dịch vụ", HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateService(@PathVariable Long id, @RequestBody SpaServiceDTO serviceDTO) {
        serviceService.updateService(id, serviceDTO);
        return new ResponseEntity<>("Cập nhật dịch vụ thành công", HttpStatus.OK);
    }
}