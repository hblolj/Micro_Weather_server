package com.hblolj.microweathereurakaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hblolj
 * @Date: 2018/5/14 10:28
 * @Description:
 * @Version: 1.0
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello, World!";
    }
}
