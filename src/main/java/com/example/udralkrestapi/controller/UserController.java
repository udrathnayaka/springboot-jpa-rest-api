package com.example.udralkrestapi.controller;

import com.example.udralkrestapi.dto.UserDTO;
import com.example.udralkrestapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/users")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userservice;
    
    @GetMapping("/getUser")
    public String getUser(){
        return "Udralk";
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
       return userservice.saveUser(userDTO);
    }

    @PutMapping("/updateUser")
    public String updateUser(){
        return "User updated!";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "User deleted!";
    }

}
