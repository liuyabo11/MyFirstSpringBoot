package com.example.test;

import com.alibaba.fastjson.JSONObject;
import com.example.bean.PerSion;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRele {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        PerSion perSion = new PerSion();
//        Method jsonObject = perSion.getClass().getMethod("getName",String.class);//方法名和形参类型
//        Object o = jsonObject.invoke(perSion,"xiaohei");//调用的对象和实参
//        System.out.println(JSONObject.toJSONString(o));

        JSONObject request = new JSONObject();
        JSONObject baseInfo = new JSONObject();

        request.put("baseInfo",baseInfo);

        baseInfo.put("aa","aa");
        baseInfo.put("bb","bb");

        System.out.println(request);



        //第一种方式获取Class对象
//        PerSion stu1 = new PerSion();//这一new 产生一个Student对象，一个Class对象。
//        Class stuClass = stu1.getClass();//获取Class对象
//        System.out.println(stuClass.getName());
//
//        //第二种方式获取Class对象
//        Class stuClass2 = PerSion.class;
//        System.out.println(stuClass == stuClass2);//判断第一种方式获取的Class对象和第二种方式获取的是否是同一个
//
//        //第三种方式获取Class对象
//        try {
//            Class stuClass3 = Class.forName("com.example.bean.PerSion");//注意此字符串必须是真实路径，就是带包名的类路径，包名.类名
//            System.out.println(stuClass3 == stuClass2);//判断三种方式是否获取的是同一个Class对象
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
