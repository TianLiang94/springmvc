package com.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
 声明后端控制器
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/test1")
    public String hello1(){
        // service doGet doPost
        System.out.println("hello1");
        // /hello.jsp
        return "hello";
    }

    @RequestMapping("/test2")
    public String hello2(){
        // service doGet doPost
        System.out.println("hello2");
        return "hello2";
    }


}
