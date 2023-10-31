package com.example.springdeployment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> listUsers() {
        return userService.getAllUsers();
    }
    


}
