package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * @author liuyabo
 * @title TestExport
 * @create 2021/1/26 14:07
 */
public class TestExport {
    public static void main(String[] args) {
//        String test = "[{\"repay_flow\":\"收付费流水号\"},{\"repay_flow_line\":\"收付费流水号项目\"}]";
//        JSONArray jsonArray = JSON.parseArray(test);
//        System.out.println(jsonArray);
//
//        for (int i = 0;i<jsonArray.size();i++) {
//            JSONObject jsonObject = jsonArray.getJSONObject(i);
//            Map.Entry<String, Object> next = jsonObject.entrySet().iterator().next();
//            System.out.println(next.getValue().toString());
//        }

        int h = 0;
        System.out.println(++h + "");

        String testArray = "[{\"sheet\":[{\"repay_flow\":\"收付费流水号1\"},{\"repay_flow_line\":\"收付费流水号项目1\"}]},{\"sheet\":[{\"repay_flow\":\"收付费流水号2\"},{\"repay_flow_line\":\"收付费流水号项目2\"}]}]";
        JSONArray jsonArray1 = JSON.parseArray(testArray);
        System.out.println(jsonArray1);

        for (int i = 0;i<jsonArray1.size();i++) {
            JSONObject jsonObject = jsonArray1.getJSONObject(i);
            JSONArray sheet = jsonObject.getJSONArray("sheet");

            for (int j = 0;j<sheet.size();j++) {
                JSONObject jsonObject1 = sheet.getJSONObject(j);
                Map.Entry<String, Object> next = jsonObject1.entrySet().iterator().next();
                System.out.println(next.getValue().toString());
            }
        }


        int[] idnex = new int[2];
    }
}
