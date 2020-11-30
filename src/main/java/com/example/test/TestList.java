package com.example.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        String test = "10000,20000,50000,100000,200000,500000,1000000,2000000,5000000,10000000,20000000,50000000,100000000,200000000,500000000,1000000000";
        String[] strArr = test.split(",");
        List<BigDecimal> list = new ArrayList<BigDecimal>();

        System.out.println(list.size());

        for (int i = 0 ; i< strArr.length ; i++ ) {
            list.add(new BigDecimal(strArr[i]));
        }

//        for (int i = 0 ; i< list.size() ; i++ ) {
//            System.out.println(list.get(i));
//        }
        List list1 = new ArrayList();
        BigDecimal b1 = new BigDecimal("10000");
        BigDecimal b2 = new BigDecimal("100000000");
        BigDecimal amount = new BigDecimal("20001");
        for (int i = 0 ; i< list.size() ; i++ ) {
            BigDecimal num = list.get(i);
            if (amount.compareTo(num) < 0) {
                if (list.get(i).compareTo(b2) >= 0) {
                    list1.add(num + "(" + num.divide(b2) + "亿)" );
                } else if (num.compareTo(b1) >= 0){
                    list1.add(num + "(" + num.divide(b1) + "万)" );
                }
            }

        }

        for (int i = 0 ; i< list1.size() ; i++ ) {
            System.out.println(list1.get(i));
        }

        System.out.println(b1.compareTo(b2));


        if (1 == 1) {
            System.out.println(1);
        } else if(2==2){
            System.out.println(2);
        } else if (3==3){
            System.out.println(3);
        }

        BigDecimal c = new BigDecimal("10000.00");

        System.out.println(b1.compareTo(c));

    }





//    public static StringBuffer formatNum(int num, Boolean b) {
//        StringBuffer sb = new StringBuffer();
//        BigDecimal b0 = new BigDecimal("100");
//        BigDecimal b1 = new BigDecimal("10000");
//        BigDecimal b2 = new BigDecimal("100000000");
//        BigDecimal b3 = new BigDecimal(num);
//
//        String formatNumStr = "";
//        String unit = "";
//
//        // 以百为单位处理
//        if (b) {
//            if (b3.compareTo(b0) == 0 || b3.compareTo(b0) == 1) {
//                return sb.append("99+");
//            }
//            return sb.append(num);
//        }
//
//        // 以万为单位处理
//        if (b3.compareTo(b1) == -1) {
//            formatNumStr = b3.toString();
//        } else if ((b3.compareTo(b1) == 0 && b3.compareTo(b1) == 1)
//                || b3.compareTo(b2) == -1) {
//            unit = "万";
//
//            formatNumStr = b3.divide(b1).toString();
//        } else if (b3.compareTo(b2) == 0 || b3.compareTo(b2) == 1) {
//            unit = "亿";
//            formatNumStr = b3.divide(b2).toString();
//
//        }
//        if (!"".equals(formatNumStr)) {
//            int i = formatNumStr.indexOf(".");
//            if (i == -1) {
//                sb.append(formatNumStr).append(unit);
//            } else {
//                i = i + 1;
//                String v = formatNumStr.substring(i, i + 1);
//                if (!v.equals("0")) {
//                    sb.append(formatNumStr.substring(0, i + 1)).append(unit);
//                } else {
//                    sb.append(formatNumStr.substring(0, i - 1)).append(unit);
//                }
//            }
//        }
//        if (sb.length() == 0)
//            return sb.append("0");
//        return sb;
//    }

}
