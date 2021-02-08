package com.example.webdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class helloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
