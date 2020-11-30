package com.example.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test001 {
    public static void main(String[] args) {
        double b = 0.01;
        double a = 11.01;
        Double data1 = new Double(a);
        Double data2 = new Double(b);
        Double data3 = new Double("100.02");
        System.out.println(data1<data2);
        System.out.println(data1<data3);
        System.out.println(data3<data1);
        System.out.println(a<data1);
        List<Double> list = new ArrayList<>();
        list.add(data1);
        list.add(data3);
        list.add(data2);

        Collections.sort(list);
        for(int i = 0;i< list.size();i++){
            System.out.println(list.get(i));
        };

        BigDecimal c = new BigDecimal("1");
//        System.out.println(JSONObject);
    }
}
