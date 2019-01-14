package com.example.api.controller;

import com.example.api.service.UserService;
import com.example.api.domain.request.UserReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="/user")
public class UserController {

    private final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;


    @GetMapping(path ="/{id}")
    public void getUser(@PathVariable(name = "id") Integer id ){
        log.debug("id={}",id);
        userService.findOneById(id);
    }

    @PostMapping
    public void create(@Validated @RequestBody UserReq user ){
        log.debug("user={}",user);
        userService.create(user);
    }

    @PutMapping
    public void update(@RequestBody UserReq user ){
        log.debug("user={}",user);
        userService.update(user);
    }

    @DeleteMapping(path ={"/{id}"})
    public void delete(@PathVariable("id") Integer id) {
        userService.delete(id);
    }
    @GetMapping
    public List findAll(){
        return userService.findAll();
    }

}
