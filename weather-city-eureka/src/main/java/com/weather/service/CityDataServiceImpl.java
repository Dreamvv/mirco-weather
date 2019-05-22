package com.weather.service;

import com.weather.entity.City;
import com.weather.entity.CityList;
import com.weather.util.XmlBuilder;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

@Service
public class CityDataServiceImpl implements CityDataService{

    @Override
    public List<City> listCity() throws Exception {
        //读取XML文件
        Resource resource = new ClassPathResource("citylist.xml");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resource.getInputStream(),"utf-8"));
        StringBuffer buffer = new StringBuffer();
        String line = "";
        while ((line = bufferedReader.readLine())!= null){
            buffer.append(line);
        }
        bufferedReader.close();
        //xml转换为java对象
        CityList cityList = (CityList) XmlBuilder.xmlstrToObject(CityList.class,buffer.toString());
        return cityList.getCityList();
    }
}
