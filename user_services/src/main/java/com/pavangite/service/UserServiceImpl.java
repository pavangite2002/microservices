package com.pavangite.service;

import com.pavangite.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    // fake userlist you can load it from database

    List<User> user = List.of(
            new User(11L, "Pavan Gite", "9172707903"),
            new User(12L, "Rahul Banchhod", "8668234567"),
            new User(13L, "Ganesh Patil", "7350412575"),
            new User(14L, "Yohesh Katole", "7350221716")
    );
    @Override
    public User getUser(long id) {
        return user.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
