package com.example.demo.util;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author liuyabo
 * @create 2020/12/29 10:37
 */
public class TestTime {
    public static void main(String[] args) {

//        Calendar calendar=Calendar.getInstance();
//        System.out.println(calendar.getTime());
//        calendar.add(Calendar.SECOND,5);
//        System.out.println(calendar.getTime());

//        SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");//格式化输出日期
//        Date now = new Date();
//        System.out.println("当前时间==》"+sdf.format(now));
//        Date beforeDate = new Date(now .getTime() - 5*1000);//60秒前的时间
//        System.out.println("后5s的时间==》"+sdf.format(beforeDate));
//
//        Calendar calendar = new GregorianCalendar();
//        calendar.setTime(now);
//        calendar.add(Calendar.DATE, 1);// 把日期往后增加一天.整数往后推,负数往前移动
//        now = calendar.getTime(); // 这个时间就是日期往后推一天的结果
//        System.out.println("日期加一天==》"+new SimpleDateFormat("yyyyMMdd").format(now));

        Date date = new Date();
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdfTime = new SimpleDateFormat("HHmmss");
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        // 把日期往后增加一天.整数往后推,负数往前移动
        calendar.add(Calendar.DATE, 1);
        // 这个时间就是日期往后推一天的结果
        Date newDate = calendar.getTime();
        System.out.println("开始日期"+sdfDate.format(date));
        System.out.println("开始时间"+sdfTime.format(date.getTime() - 5*1000));
        System.out.println("结束日期"+sdfDate.format(newDate));
        System.out.println("结束时间"+sdfTime.format(date));

    }
}
