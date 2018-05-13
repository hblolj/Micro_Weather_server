package com.hblolj.msaweathercollectionserver.task;

import com.hblolj.msaweathercollectionserver.service.WeatherCityService;
import com.hblolj.msaweathercollectionserver.service.WeatherDataCollectionService;
import com.hblolj.msaweathercollectionserver.vo.City;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Weather Data Sync Job.
 * 
 * @since 1.0.0 2017年11月23日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class WeatherDataSyncJob{
	
	private final static Logger logger = LoggerFactory.getLogger(WeatherDataSyncJob.class);

	@Autowired
	private WeatherCityService weatherCityService;
	
	@Autowired
	private WeatherDataCollectionService weatherDataCollectionService;

	protected void scheduleTest(){
		logger.info("Weather Data Sync Job. Start！");
		// 获取城市ID列表
		// 改为由城市数据微服务提供数据
		List<City> cityList = weatherCityService.listCity();
		
		// 遍历城市ID获取天气
		for (City city : cityList) {
			String cityId = city.getCityId();
			logger.info("Weather Data Sync Job, cityId:" + cityId);
			
			weatherDataCollectionService.sysncDataByCityId(cityId);
		}
		
		logger.info("Weather Data Sync Job. End！");
	}

}
