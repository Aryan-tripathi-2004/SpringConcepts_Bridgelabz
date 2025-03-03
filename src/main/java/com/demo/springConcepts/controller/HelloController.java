package com.demo.springConcepts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping(path="/web")
    public String hello(){
        return "hello";
    }

    @GetMapping(path = "/web/message")
    public String message(Model model){
        model.addAttribute("Msg","This is custom message");
        return "message";
    }
}
