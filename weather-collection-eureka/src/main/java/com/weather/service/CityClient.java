package com.weather.service;

import com.weather.entity.City;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("weather-city-eureka")
public interface CityClient {
    @GetMapping("/cities")
    List<City> listCity() throws Exception;
}
