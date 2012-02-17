package com.rmwebfx.localmenus.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class TestController {
 
    @RequestMapping("/hello")
    public ModelAndView helloWorld() {
 
        String message = "Hello World, Spring 3.0!";
        return new ModelAndView("hello", "message", message);
    }
}