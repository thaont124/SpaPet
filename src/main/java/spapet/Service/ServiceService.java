package spapet.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spapet.Model.SpaService;
import spapet.Respository.SpaServiceRepository;

import javax.management.relation.RelationNotFoundException;
import java.util.List;
import java.util.Optional;
@Service
public class ServiceService {
    @Autowired
    private SpaServiceRepository serviceRepo;
    public List<SpaService> getList(){
        return serviceRepo.findAll();
    }
    public SpaService getById(long id) throws RelationNotFoundException {
        Optional<SpaService> optional = serviceRepo.findById(id);
        return optional.orElse(null);
    }

}
