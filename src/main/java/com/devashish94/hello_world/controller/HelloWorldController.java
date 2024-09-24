package com.devashish94.hello_world.controller;

import com.devashish94.hello_world.controller.Dto.HelloWorldDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping("/world")
    public ResponseEntity<?> helloWorld() {
        return ResponseEntity.ok(new HelloWorldDto("ok", HttpStatus.OK.value(), "Hello World"));
    }

}
