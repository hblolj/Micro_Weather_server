package com.hblolj.microweathereurakaclient.controller;

import com.hblolj.microweathereurakaclient.config.CityClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hblolj
 * @Date: 2018/5/13 16:01
 * @Description:
 * @Version: 1.0
 **/
@RestController
public class CityController {

    @Autowired
    private CityClient cityClient;

    @GetMapping("/cities")
    public String listCity(){
        return cityClient.listCity();
    }
}
