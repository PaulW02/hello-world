package com.example.helloworld.services;

import com.example.helloworld.dtos.HelloWorldDTO;
import com.example.helloworld.entities.HelloWorld;
import com.example.helloworld.repositories.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HelloWorldService {

    @Autowired
    private HelloWorldRepository helloWorldRepository;

    public HelloWorldDTO getHelloWorld() {
        Optional<HelloWorld> helloWorld = helloWorldRepository.findById(1L);
        return helloWorld.map(world -> new HelloWorldDTO(world.getText())).orElse(null);
    }
}
