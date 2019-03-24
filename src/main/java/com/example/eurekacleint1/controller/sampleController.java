package com.example.eurekacleint1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class sampleController {

    @RequestMapping(method = RequestMethod.GET)
    String sample(){
        return "sample";
    }

}
