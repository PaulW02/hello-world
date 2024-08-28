package com.example.helloworld.controllers;

import com.example.helloworld.dtos.HelloWorldDTO;
import com.example.helloworld.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;


    /**
     *
     * @return hello world
     */
    @RequestMapping("/hello")
    public ResponseEntity<HelloWorldDTO> getHelloWorld() {
        HelloWorldDTO helloWorldDTO = helloWorldService.getHelloWorld();
        return ResponseEntity.ok(helloWorldDTO);
    }

}
