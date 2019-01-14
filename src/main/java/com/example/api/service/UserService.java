package com.example.api.service;

import com.example.api.domain.request.UserReq;
import com.example.persistence.model.User;
import com.example.persistence.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;


    public Optional<User> findOneById(Long id){
        log.debug("id={}",id);
        return userRepository.findById(id);
    }

    public void create(UserReq user){
        log.debug("user={}",user);
    }

    public void update(UserReq user){
        log.debug("user={}",user);
    }

    public void delete(Long id){
        log.debug("id={}",id);
    }

    public List findAll(){
        return Collections.EMPTY_LIST;
    }
}
