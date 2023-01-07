package com.helloworld.app.controllers;


import com.google.gson.Gson;
import com.helloworld.app.data.HelloWorldData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping
public class HelloWorldController {

    @Autowired
    private Gson gson;

    // Add Docker File
    @GetMapping("/helloworld")
    public ResponseEntity<String> helloWorld() {
        HelloWorldData data = new HelloWorldData();
        Date date = new Date();
        data.setDate(date);
        data.setMessage("Hello World");
        ResponseEntity<String> responseEntity = new ResponseEntity<>(gson.toJson(data), HttpStatus.OK);
        return responseEntity;
    }
}
