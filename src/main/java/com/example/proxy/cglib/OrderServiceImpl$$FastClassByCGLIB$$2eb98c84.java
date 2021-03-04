//package com.example.proxy.cglib;
//
//import java.lang.reflect.InvocationTargetException;
//
//import com.example.proxy.impl.OrderServiceImpl;
//import net.sf.cglib.core.Signature;
//import net.sf.cglib.reflect.FastClass;
//
///* compiled from: <generated> */
//public class OrderServiceImpl$$FastClassByCGLIB$$2eb98c84 extends FastClass {
//    public OrderServiceImpl$$FastClassByCGLIB$$2eb98c84(Class cls) {
//        super(cls);
//    }
//
//    public int getIndex(String str, Class[] clsArr) {
//        switch (str.hashCode()) {
//            case -1776922004:
//                if (str.equals("toString")) {
//                    switch (clsArr.length) {
//                        case 0:
//                            return 2;
//                        default:
//                            break;
//                    }
//                }
//                break;
//            case -1295482945:
//                if (str.equals("equals")) {
//                    switch (clsArr.length) {
//                        case 1:
//                            if (clsArr[0].getName().equals("java.lang.Object")) {
//                                return 1;
//                            }
//                            break;
//                        default:
//                            break;
//                    }
//                }
//                break;
//            case -1250665683:
//                if (str.equals("addOrder")) {
//                    switch (clsArr.length) {
//                        case 2:
//                            if (clsArr[0].getName().equals("java.lang.String") && clsArr[1].getName().equals("java.lang.String")) {
//                                return 0;
//                            }
//                        default:
//                            break;
//                    }
//                }
//                break;
//            case 147696667:
//                if (str.equals("hashCode")) {
//                    switch (clsArr.length) {
//                        case 0:
//                            return 3;
//                        default:
//                            break;
//                    }
//                }
//                break;
//        }
//        return -1;
//    }
//
//    public int getIndex(Signature signature) {
//        String obj = signature.toString();
//        switch (obj.hashCode()) {
//            case -1839915548:
//                if (obj.equals("addOrder(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")) {
//                    return 0;
//                }
//                break;
//            case 1826985398:
//                if (obj.equals("equals(Ljava/lang/Object;)Z")) {
//                    return 1;
//                }
//                break;
//            case 1913648695:
//                if (obj.equals("toString()Ljava/lang/String;")) {
//                    return 2;
//                }
//                break;
//            case 1984935277:
//                if (obj.equals("hashCode()I")) {
//                    return 3;
//                }
//                break;
//        }
//        return -1;
//    }
//
//    public int getIndex(Class[] clsArr) {
//        switch (clsArr.length) {
//            case 0:
//                return 0;
//            default:
//                return -1;
//        }
//    }
//
//    public int getMaxIndex() {
//        return 3;
//    }
//
//    public Object invoke(int i, Object obj, Object[] objArr) throws InvocationTargetException {
//        InvocationTargetException invocationTargetException;
//        OrderServiceImpl orderServiceImpl = (OrderServiceImpl) obj;
//        switch (i) {
//            case 0:
//                try {
//                    return orderServiceImpl.addOrder((String) objArr[0], (String) objArr[1]);
//                } catch (Throwable th) {
//                    invocationTargetException = new InvocationTargetException(th);
//                }
//            case 1:
//                return new Boolean(orderServiceImpl.equals(objArr[0]));
//            case 2:
//                return orderServiceImpl.toString();
//            case 3:
//                return new Integer(orderServiceImpl.hashCode());
//            default:
//                throw new IllegalArgumentException("Cannot find matching method/constructor");
//        }
//        invocationTargetException = new InvocationTargetException(th);
//    }
//
//    public Object newInstance(int i, Object[] objArr) throws InvocationTargetException {
//        switch (i) {
//            case 0:
//                try {
//                    return new OrderServiceImpl();
//                } catch (Throwable th) {
//                    InvocationTargetException invocationTargetException = new InvocationTargetException(th);
//                }
//            default:
//                throw new IllegalArgumentException("Cannot find matching method/constructor");
//        }
//    }
//}