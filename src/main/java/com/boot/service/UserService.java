package com.boot.service;

import com.boot.model.User;
import com.boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> findAll(){
        return userRepository.findAll();
    }

    public User findOne(int id){
        return userRepository.findOne(id);
    }

    public User saveAndFlush(User user){
        return  userRepository.saveAndFlush(user);
    }

    public User save(User user){
        return  userRepository.save(user);
    }

}
