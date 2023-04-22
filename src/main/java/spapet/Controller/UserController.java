package spapet.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spapet.DTO.UserDTO;
import spapet.Model.User;
import spapet.Respository.UserRepository;
import spapet.Service.UserService;

import javax.management.relation.RelationNotFoundException;
import java.util.List;

@RestController
@RequestMapping(path = "api/user", produces = "application/json")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public ResponseEntity<?> getListUser(){
        List<UserDTO> userList = userService.getList().getBody();
        return ResponseEntity.ok(userList);
    }
    @PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody UserDTO userDTO, @PathVariable String password){
        if (userService.exists(userDTO))
            return new ResponseEntity<>("Tên đăng nhập tồn tại. Vui lòng thay đổi", HttpStatus.CREATED);
        else {
            User newUser = userService.createUser(userDTO,password);
            return new ResponseEntity<>(newUser, HttpStatus.CREATED);
        }

    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateUser(@RequestBody UserDTO userDTO){
        userService.updateUser(userDTO);
        return new ResponseEntity<>("Cập nhật tài khoản thành công", HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@RequestBody UserDTO userDTO){
        userService.deleteUser(userDTO);
        return new ResponseEntity<>("Xóa tài khoản thành công", HttpStatus.OK);
    }

    @PatchMapping("/changePass/{id}")
    public ResponseEntity<?> changeUserPassword(@RequestBody UserDTO userDTO, @PathVariable String oldPass,
                                                @PathVariable String newPass) throws RelationNotFoundException {
        if (userService.confirmPass(userDTO.getId(),oldPass)){
            userService.changePassword(newPass,userDTO);
            return new ResponseEntity<>("Thay đổi mật khẩu thành công", HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>("Sai mật khẩu. Vui lòng thử lại", HttpStatus.OK);
        }


    }

}
