package com.example.api.controller;

import com.example.api.service.UserService;
import com.example.api.domain.request.UserReq;
import com.example.persistence.model.User;
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
    @ResponseBody
    public User getUser(@PathVariable(name = "id") Long id ){
        log.debug("id={}",id);
        return userService.findOneById(id).get();
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
    public void delete(@PathVariable("id") Long id) {
        userService.delete(id);
    }
    @GetMapping
    public List findAll(){
        return userService.findAll();
    }

}
