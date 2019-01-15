package com.example.api.service;

import com.example.persistence.model.User;
import com.example.persistence.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public void create(User user){
        log.debug("user={}",user);
        userRepository.saveAndFlush(user);
    }

    @Transactional
    public void update(User user){
        log.debug("user={}",user);
        User targetUser = userRepository.findById(user.getId()).get();
        BeanUtils.copyProperties(user , targetUser);
        userRepository.saveAndFlush(targetUser);
    }

    @Transactional
    public void delete(Long id){
        log.debug("id={}",id);
        userRepository.deleteById(id);
    }

    public List findAll(){
        return userRepository.findAll();
    }
}
