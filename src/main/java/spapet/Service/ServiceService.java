package spapet.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import spapet.DTO.SpaServiceDTO;
import spapet.Model.SpaService;
import spapet.Respository.SpaServiceRepository;

import javax.management.relation.RelationNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ServiceService {
    @Autowired
    private SpaServiceRepository serviceRepo;

//    public ResponseEntity<List<SpaServiceDTO>> getList(){
//        List<SpaService> services = serviceRepo.findAll();
//        return new ResponseEntity<>(services, HttpStatus.OK);
//    }

    public ResponseEntity<List<SpaServiceDTO>> getList(){
        List<SpaService> services = serviceRepo.findAll();
        List<SpaServiceDTO> serviceDTOList = services.stream()
                .map(service -> new SpaServiceDTO(
                        service.getId(),
                        service.getName(),
                        service.getDescription(),
                        service.getAppointmentTime(),
                        service.getFinishServTime(),
                        service.getPrice()))
                .collect(Collectors.toList());
        return new ResponseEntity<>(serviceDTOList, HttpStatus.OK);
    }


    public ResponseEntity<SpaServiceDTO> getById(long id) throws RelationNotFoundException {
        Optional<SpaService> optional = serviceRepo.findById(id);
        if (optional.isPresent()) {
            SpaService service = optional.get();
            SpaServiceDTO serviceDTO = new SpaServiceDTO(service.getId(),
                    service.getName(),
                    service.getDescription(),
                    service.getAppointmentTime(),
                    service.getFinishServTime(),
                    service.getPrice());
            return new ResponseEntity<>(serviceDTO, HttpStatus.OK);
        } else {
            throw new RelationNotFoundException("SpaService not found with id: " + id);
        }
    }

    public SpaService addService(SpaServiceDTO serviceDTO) {
        SpaService newService = new SpaService(serviceDTO.getId(),
                serviceDTO.getName(),
                serviceDTO.getDescription(),
                serviceDTO.getAppointmentTime(),
                serviceDTO.getFinishServTime(),
                serviceDTO.getPrice());
        return serviceRepo.save(newService);
    }


    public void deleteService(SpaServiceDTO serviceDTO) {
        serviceRepo.deleteById(serviceDTO.getId());
    }

    public void updateService(long id, SpaServiceDTO serviceDTO) {
        serviceRepo.deleteById(id);
        SpaService updateService = new SpaService(serviceDTO.getId(),
                serviceDTO.getName(),
                serviceDTO.getDescription(),
                serviceDTO.getAppointmentTime(),
                serviceDTO.getFinishServTime(),
                serviceDTO.getPrice());
        serviceRepo.save(updateService);
    }
}
