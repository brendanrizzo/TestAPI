package com.test.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// mark this class as a controller to handle /demo requests
@RestController
@RequestMapping(value = "/test")
public class Test {
    // create GET endpoint to serve demo data at /demo/data
  
    @GetMapping(value = "/data")
    public String getTestData() {
        return "This is a Test";
    }
}