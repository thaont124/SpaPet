package spapet.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import spapet.DTO.UserDTO;
import spapet.Model.User;
import spapet.Respository.UserRepository;

import javax.management.relation.RelationNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

//    public ResponseEntity<List<SpauserDTO>> getList(){
//        List<Spauser> users = userRepo.findAll();
//        return new ResponseEntity<>(users, HttpStatus.OK);
//    }

    public ResponseEntity<List<UserDTO>> getList(){
        List<User> users = userRepo.findAll();
        List<UserDTO> userDTOList = users.stream().map(
                user -> new UserDTO(
                    user.getId(),
                    user.getName(),
                    user.getUserName(),
                    user.getPhoneNumber())
        ).collect(Collectors.toList());

        return new ResponseEntity<>(userDTOList, HttpStatus.OK);
    }


    public ResponseEntity<UserDTO> getById(long id) throws RelationNotFoundException {
        Optional<User> optional = userRepo.findById(id);
        if (optional.isPresent()) {
            User user = optional.get();
            UserDTO userDTO = new UserDTO(user.getId(),
                    user.getName(),
                    user.getUserName(),
                    user.getPhoneNumber());
            return new ResponseEntity<>(userDTO, HttpStatus.OK);
        } else {
            throw new RelationNotFoundException("User not found with id: " + id);
        }
    }


    public User createUser(UserDTO userDTO, String password) {
        User newUser = new User(userDTO.getId(),
                userDTO.getName(),
                userDTO.getUserName(),
                password,
                userDTO.getPhoneNumber());
        return userRepo.save(newUser);
    }


    public void deleteUser(UserDTO userDTO) {
        userRepo.deleteById(userDTO.getId());
    }


    public void updateUser(UserDTO userDTO) {
        long id = userDTO.getId();
        String password = userRepo.findById(id).get().getPassword();
        userRepo.deleteById(id);
        User updateUser = new User(userDTO.getId(),
                userDTO.getName(),
                userDTO.getUserName(),
                password,
                userDTO.getPhoneNumber());
        userRepo.save(updateUser);
    }

    public void changePassword (String password, UserDTO userDTO) throws RelationNotFoundException {
        Optional<User> optional = userRepo.findById(userDTO.getId());
        if (optional.isPresent()) {
            User updateUser = optional.get();
            updateUser.setPassword(password);
            userRepo.save(updateUser);
        } else {
            throw new RelationNotFoundException("User not found with id: " + userDTO.getId());
        }
    }

    public boolean exists(UserDTO userDTO){
        String userName = userDTO.getUserName();
        if(userRepo.findByUserName(userName) != null)
            return true;
        return false;
    }

    public boolean confirmPass(long id, String password){
        User user = userRepo.findById(id).get();
        if (password == user.getPassword())
            return true;
        else return false;
    }

}
