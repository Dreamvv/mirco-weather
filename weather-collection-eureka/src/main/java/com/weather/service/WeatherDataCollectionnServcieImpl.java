package com.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

@Service
public class WeatherDataCollectionnServcieImpl implements  WeatherDataCollectionnServcie{
    private static final String WEATHER_URI="http://wthrcdn.etouch.cn/weather_mini?";
    private static final long TIME_OUT = 1800L;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Override

    public void syncDataByCityId(String cityId) {
        String uri = WEATHER_URI+"citykey="+cityId;
        this.saveWeatherData(uri);
    }

    /**
     * 把天气数据放入缓存中
     * @param uri
     */
    private void saveWeatherData(String uri){
        String key = uri;
        String strBody = null;

        ValueOperations<String,String> ops = stringRedisTemplate.opsForValue();

        ResponseEntity<String> respString = restTemplate.getForEntity(uri,String.class);
        if(respString.getStatusCodeValue() == 200){
            strBody = respString.getBody();
        }
        //数据写入缓存
        ops.set(key,strBody,TIME_OUT, TimeUnit.SECONDS);
    }
}
