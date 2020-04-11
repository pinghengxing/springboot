package com.phx.springboot.testcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/testController")
public class TestController {

    @RequestMapping(value = "/testSpringBoot")
    public  String testSpringBoot(){
        return "springBoot 2.1.13";
    }
}
