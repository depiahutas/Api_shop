package com.loparok.controller;

import com.loparok.model.Customer;
import com.loparok.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {


    @Autowired
    private UserService userService;
    

    @GetMapping("/users/profile")
    public Customer findUserByJwt(@RequestHeader("Authorization")String jwt) throws Exception {

        Customer user = userService.findCustomerByJwt(jwt);

        return user;

    }

//    @PostMapping("/users")
//    public User createUser(@RequestBody User user) throws Exception {
//
//       User isExist = userRepository.findByEmail(user.getEmail());
//        if(isExist!=null) {
//            throw new Exception("L'utilisateur existe déjà avec : " + user.getEmail());
//        }
//
//        User savedUser = userRepository.save(user);
//
//      return savedUser;
//
//    }

//    @DeleteMapping("/users/{userId}")
//    public String deleteUser(@PathVariable Long userId) throws Exception {
//
//        userRepository.deleteById(userId);
//
//        return "Utilisateur correctement supprimé";
//    }

//    @GetMapping("/users")
//    public List<User> getAllUsers() throws Exception {
//
//        List<User> users = userRepository.findAll();
//
//        return users;
//    }

//    public User findByEmail(String email) throws  Exception{
//        User user = userRepository.findByEmail(email);
//        if(user==null) {
//            throw new Exception("L'utilisateur n'existe pas avec :" + email);
//        }
//        return user;
//    }

}
