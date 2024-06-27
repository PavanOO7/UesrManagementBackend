package Test.demo.controllers;


import Test.demo.models.UserModel;
import Test.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public List<UserModel> getUserDetails(){
       return userService.getUserData();
    }
    @PostMapping
    public void  createUserDetails(@RequestBody UserModel userModel){
        userService.createUser(userModel);
    }
}
