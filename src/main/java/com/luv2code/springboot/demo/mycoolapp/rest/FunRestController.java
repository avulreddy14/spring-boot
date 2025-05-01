package com.luv2code.springboot.demo.mycoolapp.rest;

import com.sun.source.tree.ReturnTree;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }
}
