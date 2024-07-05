package com.belajar_spring.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.belajar_spring.api.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private List<User> userList;

    public UserService(){
        userList =  new ArrayList<>();

        User user1 = new User(1, "richo", 23, "richo@mail.com");
        User user2 = new User(2, "dea", 20, "dea@mail.com");
        User user3 = new User(3, "pratama", 14, "pratama@mail.com");
        User user4 = new User(4, "dhimas", 18, "dhimas@mail.com");
        User user5 = new User(5, "aditya", 29, "aditya@mail.com");
        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }

    public Optional<User> getUser(Integer id){

    Optional optional= Optional.empty();
     
        for (User user: userList){
            if(id == user.getid()){
            optional = Optional.of(user);
                return optional;
            }
        }
            return optional;
    }

}
