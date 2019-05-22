package com.weather.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weather.entity.WeatherResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Service
public class WeatherDataServiceImpl implements WeatherDataService{
    private static final String WEATHER_URI="http://wthrcdn.etouch.cn/weather_mini?";
    private static final long TIME_OUT = 1800L;
    private final static Logger logger = LoggerFactory.getLogger(WeatherDataServiceImpl.class);

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        String uri = WEATHER_URI+"citykey="+cityId;
        return this.doGetWeather(uri);
    }

    @Override
    public WeatherResponse getDataByCityName(String cityName) {
        String uri = WEATHER_URI+"city="+cityName;
        return this.doGetWeather(uri);
    }

    private WeatherResponse doGetWeather(String uri){
        String key = uri;
        String strBody = null;
        WeatherResponse resp = null;
        ObjectMapper mapper = new ObjectMapper();
        ValueOperations<String,String> ops = stringRedisTemplate.opsForValue();
        //先查缓存，缓存有的去缓存中的数据
        if(stringRedisTemplate.hasKey(key)){
            logger.info("Redis has data");
            strBody = ops.get(key);
        }else{
            //缓存中没有，调用接口查询数据
            logger.info("Redis do not has data");
           throw new RuntimeException("do not has data");
        }
        try {
            resp = mapper.readValue(strBody,WeatherResponse.class);
        } catch (IOException e) {
            //e.printStackTrace();
            logger.error("Error",e);
        }
        return resp;

    }

}
