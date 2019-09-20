package com.boot.controller;


import com.boot.model.User;
import com.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/")
    public  @ResponseBody Iterable<User> getAllUsers(){
        return userService.findAll();
    }

    @RequestMapping(path = "/{id}")
    public @ResponseBody User getOneUser(@PathVariable int id) {

        return userService.findOne(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<User> update(@RequestBody User user) {
        userService.saveAndFlush(user);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }


}
