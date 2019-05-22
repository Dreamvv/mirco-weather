package com.weather.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.Reader;
import java.io.StringReader;

/**
 * 将xml转换为pojo
 */
public class XmlBuilder {

    public static Object xmlstrToObject(Class<?> clazz,String xmlstr) throws Exception{
        Object xmlObject = null;
        Reader reader = null;
        JAXBContext context = JAXBContext.newInstance(clazz);

        //XML转换为对象的接口
       Unmarshaller unmarshaller =  context.createUnmarshaller();
       reader = new StringReader(xmlstr);
       xmlObject = unmarshaller.unmarshal(reader);
       if (null != reader){
           reader.close();
       }
        return  xmlObject;

    }
}
