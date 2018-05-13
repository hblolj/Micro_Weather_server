package com.hblolj.msaweathercityserver.controller;

import com.hblolj.msaweathercityserver.service.CityDataService;
import com.hblolj.msaweathercityserver.vo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: hblolj
 * @Date: 2018/5/12 17:23
 * @Description:
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityDataService cityDataService;

    @GetMapping("/list")
    public List<City> listCitys() throws Exception {
        return cityDataService.listCity();
    }
}
