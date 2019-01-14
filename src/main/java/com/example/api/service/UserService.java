package com.example.api.service;

import com.example.api.domain.request.UserReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {

    private final Logger log = LoggerFactory.getLogger(UserService.class);

    public void findOneById(Integer id){
        log.debug("id={}",id);
    }

    public void create(UserReq user){
        log.debug("user={}",user);
    }

    public void update(UserReq user){
        log.debug("user={}",user);
    }

    public void delete(Integer id){
        log.debug("id={}",id);
    }

    public List findAll(){
        return Collections.EMPTY_LIST;
    }
}
