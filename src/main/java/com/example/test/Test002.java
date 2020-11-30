package com.example.test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test002 {
    public static void main(String[] args) {
//        String str = new Test002().openFile();
//        System.out.println(str);

//        JSONObject test =JSONObject.parseObject(null);
//        if (test == null) {
//            System.out.println(111);
//        }else if (test != null){
//            System.out.println(222);
//        }

        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("1","1");
        jsonArray.add(jsonObject);
        System.out.println(jsonArray);

    }


}
