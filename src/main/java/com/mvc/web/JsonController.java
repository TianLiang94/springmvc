package com.mvc.web;

import com.mvc.entity.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class JsonController {
    public User test1(){
        System.out.println("test1");
        User user = new User(1,"张三",new Date());
        List<String> hobby = new ArrayList();
        user.setHobby(hobby);
        return user;
    }
}
