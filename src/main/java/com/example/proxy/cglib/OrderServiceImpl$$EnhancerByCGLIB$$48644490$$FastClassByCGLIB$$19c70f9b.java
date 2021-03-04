//package com.example.proxy.cglib;
//
//import java.lang.reflect.InvocationTargetException;
//import net.sf.cglib.core.Signature;
//import net.sf.cglib.proxy.Callback;
//import net.sf.cglib.reflect.FastClass;
//
///* compiled from: <generated> */
//public class OrderServiceImpl$$EnhancerByCGLIB$$48644490$$FastClassByCGLIB$$19c70f9b extends FastClass {
//    public OrderServiceImpl$$EnhancerByCGLIB$$48644490$$FastClassByCGLIB$$19c70f9b(Class cls) {
//        super(cls);
//    }
//
//    public int getIndex(String str, Class[] clsArr) {
//        switch (str.hashCode()) {
//            case -1776922004:
//                if (str.equals("toString")) {
//                    switch (clsArr.length) {
//                        case 0:
//                            return 1;
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
//                                return 0;
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
//                                return 7;
//                            }
//                        default:
//                            break;
//                    }
//                }
//                break;
//            case -1053468136:
//                if (str.equals("getCallbacks")) {
//                    switch (clsArr.length) {
//                        case 0:
//                            return 11;
//                        default:
//                            break;
//                    }
//                }
//                break;
//            case -124978609:
//                if (str.equals("CGLIB$equals$1")) {
//                    switch (clsArr.length) {
//                        case 1:
//                            if (clsArr[0].getName().equals("java.lang.Object")) {
//                                return 15;
//                            }
//                            break;
//                        default:
//                            break;
//                    }
//                }
//                break;
//            case -60403779:
//                if (str.equals("CGLIB$SET_STATIC_CALLBACKS")) {
//                    switch (clsArr.length) {
//                        case 1:
//                            if (clsArr[0].getName().equals("[Lnet.sf.cglib.proxy.Callback;")) {
//                                return 12;
//                            }
//                            break;
//                        default:
//                            break;
//                    }
//                }
//                break;
//            case -29025555:
//                if (str.equals("CGLIB$hashCode$3")) {
//                    switch (clsArr.length) {
//                        case 0:
//                            return 16;
//                        default:
//                            break;
//                    }
//                }
//                break;
//            case 85179481:
//                if (str.equals("CGLIB$SET_THREAD_CALLBACKS")) {
//                    switch (clsArr.length) {
//                        case 1:
//                            if (clsArr[0].getName().equals("[Lnet.sf.cglib.proxy.Callback;")) {
//                                return 13;
//                            }
//                            break;
//                        default:
//                            break;
//                    }
//                }
//                break;
//            case 94756189:
//                if (str.equals("clone")) {
//                    switch (clsArr.length) {
//                        case 0:
//                            return 3;
//                        default:
//                            break;
//                    }
//                }
//                break;
//            case 147696667:
//                if (str.equals("hashCode")) {
//                    switch (clsArr.length) {
//                        case 0:
//                            return 2;
//                        default:
//                            break;
//                    }
//                }
//                break;
//            case 161998109:
//                if (str.equals("CGLIB$STATICHOOK1")) {
//                    switch (clsArr.length) {
//                        case 0:
//                            return 14;
//                        default:
//                            break;
//                    }
//                }
//                break;
//            case 469519740:
//                if (str.equals("CGLIB$addOrder$0")) {
//                    switch (clsArr.length) {
//                        case 2:
//                            if (clsArr[0].getName().equals("java.lang.String") && clsArr[1].getName().equals("java.lang.String")) {
//                                return 17;
//                            }
//                        default:
//                            break;
//                    }
//                }
//                break;
//            case 495524492:
//                if (str.equals("setCallbacks")) {
//                    switch (clsArr.length) {
//                        case 1:
//                            if (clsArr[0].getName().equals("[Lnet.sf.cglib.proxy.Callback;")) {
//                                return 9;
//                            }
//                            break;
//                        default:
//                            break;
//                    }
//                }
//                break;
//            case 1154623345:
//                if (str.equals("CGLIB$findMethodProxy")) {
//                    switch (clsArr.length) {
//                        case 1:
//                            if (clsArr[0].getName().equals("net.sf.cglib.core.Signature")) {
//                                return 20;
//                            }
//                            break;
//                        default:
//                            break;
//                    }
//                }
//                break;
//            case 1543336189:
//                if (str.equals("CGLIB$toString$2")) {
//                    switch (clsArr.length) {
//                        case 0:
//                            return 19;
//                        default:
//                            break;
//                    }
//                }
//                break;
//            case 1811874389:
//                if (str.equals("newInstance")) {
//                    switch (clsArr.length) {
//                        case 1:
//                            String name = clsArr[0].getName();
//                            switch (name.hashCode()) {
//                                case -845341380:
//                                    if (name.equals("net.sf.cglib.proxy.Callback")) {
//                                        return 6;
//                                    }
//                                    break;
//                                case 1730110032:
//                                    if (name.equals("[Lnet.sf.cglib.proxy.Callback;")) {
//                                        return 4;
//                                    }
//                                    break;
//                                default:
//                                    break;
//                            }
//                        case 3:
//                            if (clsArr[0].getName().equals("[Ljava.lang.Class;") && clsArr[1].getName().equals("[Ljava.lang.Object;") && clsArr[2].getName().equals("[Lnet.sf.cglib.proxy.Callback;")) {
//                                return 5;
//                            }
//                        default:
//                            break;
//                    }
//                }
//                break;
//            case 1817099975:
//                if (str.equals("setCallback")) {
//                    switch (clsArr.length) {
//                        case 2:
//                            if (clsArr[0].getName().equals("int") && clsArr[1].getName().equals("net.sf.cglib.proxy.Callback")) {
//                                return 8;
//                            }
//                        default:
//                            break;
//                    }
//                }
//                break;
//            case 1905679803:
//                if (str.equals("getCallback")) {
//                    switch (clsArr.length) {
//                        case 1:
//                            if (clsArr[0].getName().equals("int")) {
//                                return 10;
//                            }
//                            break;
//                        default:
//                            break;
//                    }
//                }
//                break;
//            case 1951977610:
//                if (str.equals("CGLIB$clone$4")) {
//                    switch (clsArr.length) {
//                        case 0:
//                            return 18;
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
//            case -2055565910:
//                if (obj.equals("CGLIB$SET_THREAD_CALLBACKS([Lnet/sf/cglib/proxy/Callback;)V")) {
//                    return 13;
//                }
//                break;
//            case -1882565338:
//                if (obj.equals("CGLIB$equals$1(Ljava/lang/Object;)Z")) {
//                    return 15;
//                }
//                break;
//            case -1839915548:
//                if (obj.equals("addOrder(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")) {
//                    return 7;
//                }
//                break;
//            case -1457535688:
//                if (obj.equals("CGLIB$STATICHOOK1()V")) {
//                    return 14;
//                }
//                break;
//            case -1411842725:
//                if (obj.equals("CGLIB$hashCode$3()I")) {
//                    return 16;
//                }
//                break;
//            case -894172689:
//                if (obj.equals("newInstance(Lnet/sf/cglib/proxy/Callback;)Ljava/lang/Object;")) {
//                    return 6;
//                }
//                break;
//            case -623122092:
//                if (obj.equals("CGLIB$findMethodProxy(Lnet/sf/cglib/core/Signature;)Lnet/sf/cglib/proxy/MethodProxy;")) {
//                    return 20;
//                }
//                break;
//            case -508378822:
//                if (obj.equals("clone()Ljava/lang/Object;")) {
//                    return 3;
//                }
//                break;
//            case -419626537:
//                if (obj.equals("setCallbacks([Lnet/sf/cglib/proxy/Callback;)V")) {
//                    return 9;
//                }
//                break;
//            case 560567118:
//                if (obj.equals("setCallback(ILnet/sf/cglib/proxy/Callback;)V")) {
//                    return 8;
//                }
//                break;
//            case 811063227:
//                if (obj.equals("newInstance([Ljava/lang/Class;[Ljava/lang/Object;[Lnet/sf/cglib/proxy/Callback;)Ljava/lang/Object;")) {
//                    return 5;
//                }
//                break;
//            case 973717575:
//                if (obj.equals("getCallbacks()[Lnet/sf/cglib/proxy/Callback;")) {
//                    return 11;
//                }
//                break;
//            case 1091426099:
//                if (obj.equals("CGLIB$addOrder$0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")) {
//                    return 17;
//                }
//                break;
//            case 1221173700:
//                if (obj.equals("newInstance([Lnet/sf/cglib/proxy/Callback;)Ljava/lang/Object;")) {
//                    return 4;
//                }
//                break;
//            case 1230699260:
//                if (obj.equals("getCallback(I)Lnet/sf/cglib/proxy/Callback;")) {
//                    return 10;
//                }
//                break;
//            case 1306468936:
//                if (obj.equals("CGLIB$toString$2()Ljava/lang/String;")) {
//                    return 19;
//                }
//                break;
//            case 1584330438:
//                if (obj.equals("CGLIB$SET_STATIC_CALLBACKS([Lnet/sf/cglib/proxy/Callback;)V")) {
//                    return 12;
//                }
//                break;
//            case 1800494055:
//                if (obj.equals("CGLIB$clone$4()Ljava/lang/Object;")) {
//                    return 18;
//                }
//                break;
//            case 1826985398:
//                if (obj.equals("equals(Ljava/lang/Object;)Z")) {
//                    return 0;
//                }
//                break;
//            case 1913648695:
//                if (obj.equals("toString()Ljava/lang/String;")) {
//                    return 1;
//                }
//                break;
//            case 1984935277:
//                if (obj.equals("hashCode()I")) {
//                    return 2;
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
//        return 20;
//    }
//
//    public Object invoke(int i, Object obj, Object[] objArr) throws InvocationTargetException {
//        InvocationTargetException invocationTargetException;
//        48644490 48644490 = (48644490) obj;
//        switch (i) {
//            case 0:
//                try {
//                    return new Boolean(48644490.equals(objArr[0]));
//                } catch (Throwable th) {
//                    invocationTargetException = new InvocationTargetException(th);
//                }
//            case 1:
//                return 48644490.toString();
//            case 2:
//                return new Integer(48644490.hashCode());
//            case 3:
//                return 48644490.clone();
//            case 4:
//                return 48644490.newInstance((Callback[]) objArr[0]);
//            case 5:
//                return 48644490.newInstance((Class[]) objArr[0], (Object[]) objArr[1], (Callback[]) objArr[2]);
//            case 6:
//                return 48644490.newInstance((Callback) objArr[0]);
//            case 7:
//                return 48644490.addOrder((String) objArr[0], (String) objArr[1]);
//            case 8:
//                48644490.setCallback(((Number) objArr[0]).intValue(), (Callback) objArr[1]);
//                return null;
//            case 9:
//                48644490.setCallbacks((Callback[]) objArr[0]);
//                return null;
//            case 10:
//                return 48644490.getCallback(((Number) objArr[0]).intValue());
//            case 11:
//                return 48644490.getCallbacks();
//            case 12:
//                48644490.CGLIB$SET_STATIC_CALLBACKS((Callback[]) objArr[0]);
//                return null;
//            case 13:
//                48644490.CGLIB$SET_THREAD_CALLBACKS((Callback[]) objArr[0]);
//                return null;
//            case 14:
//                48644490.CGLIB$STATICHOOK1();
//                return null;
//            case 15:
//                return new Boolean(48644490.CGLIB$equals$1(objArr[0]));
//            case 16:
//                return new Integer(48644490.CGLIB$hashCode$3());
//            case 17:
//                return 48644490.CGLIB$addOrder$0((String) objArr[0], (String) objArr[1]);
//            case 18:
//                return 48644490.CGLIB$clone$4();
//            case 19:
//                return 48644490.CGLIB$toString$2();
//            case 20:
//                return 48644490.CGLIB$findMethodProxy((Signature) objArr[0]);
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
//                    return new 48644490();
//                } catch (Throwable th) {
//                    InvocationTargetException invocationTargetException = new InvocationTargetException(th);
//                }
//            default:
//                throw new IllegalArgumentException("Cannot find matching method/constructor");
//        }
//    }
//}