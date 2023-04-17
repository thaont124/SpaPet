package spapet.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spapet.Model.User;
import spapet.Respository.UserRepository;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;
    public List<User> listAll(){
        return userRepo.findAll();
    }
}
