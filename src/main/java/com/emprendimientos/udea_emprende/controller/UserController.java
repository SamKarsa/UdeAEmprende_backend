package com.emprendimientos.udea_emprende.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emprendimientos.udea_emprende.model.User;
import com.emprendimientos.udea_emprende.service.UserService;

import getMethodDTO.UserGetDTO;
import postMethodDTO.UserPostDTO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserGetDTO> getAllUsers() {
        List<User> users = userService.getAllUsers();
        List<UserGetDTO> usersDTO = new ArrayList<>();

        for (User user : users) {
            UserGetDTO userGetDTO = new UserGetDTO();
            userGetDTO.setUserId(user.getUserId());
            userGetDTO.setEmail(user.getEmail());
            userGetDTO.setPassword(user.getPassword());
            userGetDTO.setUserStatus(user.getUserStatus());

            usersDTO.add(userGetDTO);
        }
        return usersDTO;
    }

    @PostMapping
    public User createNewUser(@RequestBody UserPostDTO userPostDTO) {
        User newUser = new User();
        newUser.setEmail(userPostDTO.getEmail());
        newUser.setPassword(userPostDTO.getPassword());
        newUser.setUserStatus(userPostDTO.getUserStatus());

        userService.saveUser(newUser);
        return newUser;
    }

    @GetMapping("/{id}")
    public UserGetDTO getUserById(@PathVariable Integer id) {
        User user = userService.getUserById(id);
        UserGetDTO userGetDTO = new UserGetDTO();
        userGetDTO.setUserId(user.getUserId());
        userGetDTO.setEmail(user.getEmail());
        userGetDTO.setPassword(user.getPassword());
        userGetDTO.setUserStatus(user.getUserStatus());
        return userGetDTO;
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Integer id) {
        userService.deleteUserById(id);
    }

}
