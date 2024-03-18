package com.pavangite.controller;

import com.pavangite.entity.User;
import com.pavangite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private RestTemplate restTemplate;

    /*
    @GetMapping("/{userId}")
    public User getUser(@PathVariable Long userId){
        return userService.getUser(userId);
    }
     */

    @GetMapping("/{userid}")
    public User getUser(@PathVariable(name="userid") Long userId) {
        User users = userService.getUser(userId);
        // http://localhost:9002/contact/user/14
//        List contacts = restTemplate.getForObject("http://localhost:9002/contact/user/14", List.class);  // this will be static only for userId=14
       // List contacts = restTemplate.getForObject("http://localhost:9002/contact/user/"+userId, List.class);  // this will be Dynamic for userId passed in request Or
        List contacts = restTemplate.getForObject("http://localhost:9002/contact/user/"+users.getUserId(), List.class);  // this will be Dynamic for userId passed in request
            // One more DisAdvantage is that this is an HardCoded as it will only work for localhost:9002
            // if we have request from diff port it will fail we can overcome this by using Eureka Server
        users.setContact(contacts);
        return users;
    }
}
