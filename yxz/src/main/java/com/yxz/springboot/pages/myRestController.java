package com.yxz.springboot.pages;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myRestController{

    @GetMapping("/dynamic")
    public String redirectTo(){
        return "<h1>This is dynamic Page</h1>";
    }

}
