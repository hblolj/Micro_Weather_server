package com.hblolj.msaweathercollectionserver.config;

import com.hblolj.msaweathercollectionserver.task.WeatherDataSyncJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * Quartz Configuration.
 * 
 * @since 1.0.0 2017年11月23日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class QuartzConfiguration {

	/**
	 * 更新频率
	 */
	private static final int TIME = 1800;

	// JobDetail
	@Bean(name = "jobDetail")
	public MethodInvokingJobDetailFactoryBean weatherDataSyncJobDetail(WeatherDataSyncJob task) {
		MethodInvokingJobDetailFactoryBean jobDetail = new MethodInvokingJobDetailFactoryBean();
		jobDetail.setConcurrent(false);
		// 设置任务的名字
		jobDetail.setName("scheduler");
		// 设置任务的分组，这些属性都可以存储在数据库中，在多任务的时候使用
		jobDetail.setGroup("scheduler_group");
		jobDetail.setTargetObject(task);
		jobDetail.setTargetMethod("scheduleTest");
		return jobDetail;
	}
	
	// Trigger
	@Bean("cronJobTrigger")
	public CronTriggerFactoryBean weatherDataSyncTrigger(MethodInvokingJobDetailFactoryBean jobDetail) {

		CronTriggerFactoryBean tigger = new CronTriggerFactoryBean();
		tigger.setJobDetail(jobDetail.getObject());
		// 表示每隔6秒钟执行一次
		tigger.setCronExpression("0 0/30 * * * ?");
		//trigger的name
		tigger.setName("myTigger");
		return tigger;
	}

	@Bean(name = "scheduler")
	public SchedulerFactoryBean schedulerFactory(Trigger cronJobTrigger) {
		SchedulerFactoryBean bean = new SchedulerFactoryBean();
		//设置是否任意一个已定义的Job会覆盖现在的Job。默认为false，即已定义的Job不会覆盖现有的Job。
		bean.setOverwriteExistingJobs(true);
		// 延时启动，应用启动5秒后  ，定时器才开始启动
		bean.setStartupDelay(5);
		// 注册定时触发器
		bean.setTriggers(cronJobTrigger);
		return bean;
	}
}
