package com.weather.job;

import com.weather.entity.City;
import com.weather.service.CityClient;
import com.weather.service.WeatherDataCollectionnServcie;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.List;

public class WeatherDataSyncJob extends QuartzJobBean {

    @Autowired
    private WeatherDataCollectionnServcie weatherDataCollectionnServcie;
    @Autowired
    private CityClient cityClient;
    private final static Logger logger = LoggerFactory.getLogger(WeatherDataSyncJob.class);
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("weather Data Sync Jobs Start!");
        List<City> cityList = null;
        try {
            //TODO 改为由城市数据微服务提供数据
            cityList = cityClient.listCity();

        } catch (Exception e) {
            logger.info("exception!",e);
        }

        //遍历城市ID获取天气
        for(City city : cityList){
            String cityId = city.getCityId();
            logger.info("Weather Data Sync Job,cityId:"+cityId);
            weatherDataCollectionnServcie.syncDataByCityId(cityId);
        }
        logger.info("weather Data Sync Jobs End!");
    }
}
