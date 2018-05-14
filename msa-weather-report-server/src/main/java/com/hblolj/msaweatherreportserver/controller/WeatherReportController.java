package com.hblolj.msaweatherreportserver.controller;

import java.util.List;

import com.hblolj.msaweatherreportserver.service.WeatherDataService;
import com.hblolj.msaweatherreportserver.service.WeatherReportService;
import com.hblolj.msaweatherreportserver.vo.City;
import com.hblolj.msaweatherreportserver.vo.Weather;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Weather Report Controller.
 * 
 * @since 1.0.0 2017年11月24日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@RestController
@RequestMapping("/report")
public class WeatherReportController {

	private final static Logger logger = LoggerFactory.getLogger(WeatherReportController.class);  

	@Autowired
	private WeatherReportService weatherReportService;

	@Autowired
	private WeatherDataService weatherDataService;
	
	@GetMapping("/cityId/{cityId}")
	public ModelAndView getReportByCityId(@PathVariable("cityId") String cityId, Model model) throws Exception {
		// 获取城市ID列表
		// 改为由城市数据API微服务来提供数据(实际上寻找的是路由微服务)
		List<City> cityList = weatherDataService.listCity();
		
		model.addAttribute("title", "Ori的天气预报");
		model.addAttribute("cityId", cityId);
		model.addAttribute("cityList", cityList);
		model.addAttribute("report", weatherReportService.getDataByCityId(cityId));
		return new ModelAndView("weather/report", "reportModel", model);
	}
}
