package com.weather;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap();
        map.put("aaa",22);
        map.put("bbb",33);
        map.put("ccc",44);
        map.put("ddd",55);
        map.put("aaa",66);
        // 1. 通过Map.keySet遍历key和value：
        for (Object key : map.keySet()){
            System.out.println("Key: "+key+" Value: "+map.get(key));
        }

        System.out.println("=========================");

        //2. 通过Map.entrySet使用iterator遍历key和value：
        Iterator maplit = map.entrySet().iterator();
        while (maplit.hasNext()){
            Map.Entry entry = (Map.Entry<String, Integer>) maplit.next();
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }

        System.out.println("=========================");

        //3. 通过Map.entrySet遍历key和value
      for(Map.Entry<String,Integer> entry: map.entrySet()) {
          System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
      }



    }
}
