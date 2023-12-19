package com.lnt.springbootdemo.API.Users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.OrderBy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    UserRepository userRepository;


    // GET -> ALL USERS
    @OrderBy("name ASC")
    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        ResponseEntity<List<User>> re = null;
        List<User> users =  userRepository.findAll();
        re = new ResponseEntity<>(users,HttpStatus.CREATED);
        return re;
    }


    // GET -> Find Users Whose name is avialable
    @GetMapping("/users/find/namenotnull")
    public ResponseEntity<List<User>> getUsersNameNotNull() {
        ResponseEntity<List<User>> re = null;
        List<User> users =  userRepository.findByNameIsNotNull();
        re = new ResponseEntity<>(users,HttpStatus.CREATED);
        return re;
    }


    // GET -> Find users whose name is not avialable
    @GetMapping("/users/find/namenull")
    public ResponseEntity<List<User>> getUsersNameNull() {
        ResponseEntity<List<User>> re = null;
        List<User> users =  userRepository.findByNameIsNull();
        re = new ResponseEntity<>(users,HttpStatus.CREATED);
        return re;
    }


    // GET -> Find users order by name
    @GetMapping("/users/find/orderbyname")
    public ResponseEntity<List<User>> getUsersOrderByName() {
        ResponseEntity<List<User>> re = null;
        List<User> users =  userRepository.OrderByName();
        re = new ResponseEntity<>(users,HttpStatus.CREATED);
        return re;
    }
    

    // GET -> Find users order by name and name not null
    @GetMapping("/users/find/orderbynameandnotnull")
    public ResponseEntity<List<User>> getUsersAvialableOrderByName() {
        ResponseEntity<List<User>> re = null;
        List<User> users =  userRepository.findByNameIsNotNullOrderByName();
        re = new ResponseEntity<>(users,HttpStatus.CREATED);
        return re;
    }


    // GET -> Find users order by age High to Low
    @GetMapping("/users/find/orderbyage")
    public ResponseEntity<List<User>> getUsersOrderByAge() {
        ResponseEntity<List<User>> re = null;
        List<User> users =  userRepository.OrderByAge();
        re = new ResponseEntity<>(users,HttpStatus.CREATED);
        return re;
    }

    // GET -> Find users containing given name
    @GetMapping("/users/find/contains")
    public ResponseEntity<List<User>> getUsersContainingName(@RequestParam("name") String name) {
        ResponseEntity<List<User>> re = null;
        List<User> users =  userRepository.findByNameContaining(name);
        re = new ResponseEntity<>(users,HttpStatus.CREATED);
        return re;
    }


    // GET -> Find Users who is active
    @GetMapping("/users/find/active")
    public ResponseEntity<List<User>> getActiveUsers() {
        ResponseEntity<List<User>> re = null;
        List<User> users =  userRepository.findByActiveTrue();
        re = new ResponseEntity<>(users,HttpStatus.CREATED);
        return re;
    }


    // GET -> Find Users who is not active
    @GetMapping("/users/find/notactive")
    public ResponseEntity<List<User>> getNotActiveUsers() {
        ResponseEntity<List<User>> re = null;
        List<User> users =  userRepository.findByActiveFalse();
        re = new ResponseEntity<>(users,HttpStatus.CREATED);
        return re;
    }
    

    // POST -> CREATE NEW USER
    @PostMapping("/users")
    public ResponseEntity<Void> createuser(@RequestBody User newuser) {
        ResponseEntity<Void> re = null;
        userRepository.save(newuser);
        re = new ResponseEntity<>(HttpStatus.CREATED);
        return re;
    }

    
}
