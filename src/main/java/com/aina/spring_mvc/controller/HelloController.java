package com.aina.spring_mvc.controller;

import com.aina.spring_mvc.model.Commune;
import com.aina.spring_mvc.model.District;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public void hello (){
        System.out.println("Hello world");
    }


}
