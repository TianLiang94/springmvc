package com.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/data")
@SessionAttributes(names = {"city","street"})
public class DataController {

    @RequestMapping("/test1")
    public String testData(HttpServletRequest request, HttpSession session){
        System.out.println("test1");
        request.setAttribute("name","张三");
        session.setAttribute("age",18);
        return "data";
    }

    @RequestMapping("/test2")
    public String test2(Model model){
        //model.addAttribute("gender",true);
        model.addAttribute("city","北京");
        model.addAttribute("street","长安街");
        model.addAttribute("city","深圳");
        model.addAttribute("street","安街");
        return "data2";
    }

    @RequestMapping("/test4")
    public ModelAndView test4(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("forward:/hello.jsp");
        modelAndView.addObject("claz","001");
        return modelAndView;
    }

}
