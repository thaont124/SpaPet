package spapet.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spapet.Model.User;
import spapet.Service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public ResponseEntity<?> getListUser(){
        List<User> userList = userService.listAll();
        return ResponseEntity.ok(userList);
    }
    @PostMapping
    public ResponseEntity<?> createUser(){
        return null;
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(){
        return null;
    }
    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteUser(){
        return null;
    }

}
