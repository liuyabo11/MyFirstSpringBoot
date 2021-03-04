//
//import java.lang.reflect.Method;
//
//import com.example.proxy.impl.OrderServiceImpl;
//import net.sf.cglib.core.ReflectUtils;
//import net.sf.cglib.core.Signature;
//import net.sf.cglib.proxy.Callback;
//import net.sf.cglib.proxy.Factory;
//import net.sf.cglib.proxy.MethodInterceptor;
//import net.sf.cglib.proxy.MethodProxy;
//
///* compiled from: <generated> */
//public class OrderServiceImpl$$EnhancerByCGLIB$$48644490 extends OrderServiceImpl implements Factory {
//    private static Object CGLIB$CALLBACK_FILTER;
//    public static Object CGLIB$FACTORY_DATA;
//    private static final Callback[] CGLIB$STATIC_CALLBACKS = null;
//    private static final ThreadLocal CGLIB$THREAD_CALLBACKS = null;
//    private static final Method CGLIB$addOrder$0$Method = null;
//    private static final MethodProxy CGLIB$addOrder$0$Proxy = null;
//    private static final Method CGLIB$clone$4$Method = null;
//    private static final MethodProxy CGLIB$clone$4$Proxy = null;
//    private static final Object[] CGLIB$emptyArgs = null;
//    private static final Method CGLIB$equals$1$Method = null;
//    private static final MethodProxy CGLIB$equals$1$Proxy = null;
//    private static final Method CGLIB$hashCode$3$Method = null;
//    private static final MethodProxy CGLIB$hashCode$3$Proxy = null;
//    private static final Method CGLIB$toString$2$Method = null;
//    private static final MethodProxy CGLIB$toString$2$Proxy = null;
//    private boolean CGLIB$BOUND;
//    private MethodInterceptor CGLIB$CALLBACK_0;
//
//    static {
//        CGLIB$STATICHOOK1();
//    }
//
//    public OrderServiceImpl$$EnhancerByCGLIB$$48644490() {
//        CGLIB$BIND_CALLBACKS(this);
//    }
//
//    private static final void CGLIB$BIND_CALLBACKS(Object obj) {
//        OrderServiceImpl$$EnhancerByCGLIB$$48644490 orderServiceImpl$$EnhancerByCGLIB$$48644490 = (OrderServiceImpl$$EnhancerByCGLIB$$48644490) obj;
//        if (!orderServiceImpl$$EnhancerByCGLIB$$48644490.CGLIB$BOUND) {
//            orderServiceImpl$$EnhancerByCGLIB$$48644490.CGLIB$BOUND = true;
//            Object obj2 = CGLIB$THREAD_CALLBACKS.get();
//            if (obj2 == null) {
//                obj2 = CGLIB$STATIC_CALLBACKS;
//                if (obj2 == null) {
//                    return;
//                }
//            }
//            orderServiceImpl$$EnhancerByCGLIB$$48644490.CGLIB$CALLBACK_0 = (MethodInterceptor) ((Callback[]) obj2)[0];
//        }
//    }
//
//    public static void CGLIB$SET_STATIC_CALLBACKS(Callback[] callbackArr) {
//        CGLIB$STATIC_CALLBACKS = callbackArr;
//    }
//
//    public static void CGLIB$SET_THREAD_CALLBACKS(Callback[] callbackArr) {
//        CGLIB$THREAD_CALLBACKS.set(callbackArr);
//    }
//
//    static void CGLIB$STATICHOOK1() {
//        CGLIB$THREAD_CALLBACKS = new ThreadLocal();
//        CGLIB$emptyArgs = new Object[0];
//        Class cls = Class.forName("com.example.proxy.impl.OrderServiceImpl$$EnhancerByCGLIB$$48644490");
//        String[] strArr = new String[]{"equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "clone", "()Ljava/lang/Object;"};
//        Class cls2 = Class.forName("java.lang.Object");
//        Method[] findMethods = ReflectUtils.findMethods(strArr, cls2.getDeclaredMethods());
//        CGLIB$equals$1$Method = findMethods[0];
//        CGLIB$equals$1$Proxy = MethodProxy.create(cls2, cls, "(Ljava/lang/Object;)Z", "equals", "CGLIB$equals$1");
//        CGLIB$toString$2$Method = findMethods[1];
//        CGLIB$toString$2$Proxy = MethodProxy.create(cls2, cls, "()Ljava/lang/String;", "toString", "CGLIB$toString$2");
//        CGLIB$hashCode$3$Method = findMethods[2];
//        CGLIB$hashCode$3$Proxy = MethodProxy.create(cls2, cls, "()I", "hashCode", "CGLIB$hashCode$3");
//        CGLIB$clone$4$Method = findMethods[3];
//        CGLIB$clone$4$Proxy = MethodProxy.create(cls2, cls, "()Ljava/lang/Object;", "clone", "CGLIB$clone$4");
//        strArr = new String[]{"addOrder", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"};
//        cls2 = Class.forName("com.example.proxy.impl.OrderServiceImpl");
//        CGLIB$addOrder$0$Method = ReflectUtils.findMethods(strArr, cls2.getDeclaredMethods())[0];
//        CGLIB$addOrder$0$Proxy = MethodProxy.create(cls2, cls, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "addOrder", "CGLIB$addOrder$0");
//    }
//
//    public static MethodProxy CGLIB$findMethodProxy(Signature signature) {
//        String obj = signature.toString();
//        switch (obj.hashCode()) {
//            case -1839915548:
//                if (obj.equals("addOrder(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")) {
//                    return CGLIB$addOrder$0$Proxy;
//                }
//                break;
//            case -508378822:
//                if (obj.equals("clone()Ljava/lang/Object;")) {
//                    return CGLIB$clone$4$Proxy;
//                }
//                break;
//            case 1826985398:
//                if (obj.equals("equals(Ljava/lang/Object;)Z")) {
//                    return CGLIB$equals$1$Proxy;
//                }
//                break;
//            case 1913648695:
//                if (obj.equals("toString()Ljava/lang/String;")) {
//                    return CGLIB$toString$2$Proxy;
//                }
//                break;
//            case 1984935277:
//                if (obj.equals("hashCode()I")) {
//                    return CGLIB$hashCode$3$Proxy;
//                }
//                break;
//        }
//        return null;
//    }
//
//    final String CGLIB$addOrder$0(String str, String str2) {
//        return super.addOrder(str, str2);
//    }
//
//    final Object CGLIB$clone$4() throws CloneNotSupportedException {
//        return super.clone();
//    }
//
//    final boolean CGLIB$equals$1(Object obj) {
//        return super.equals(obj);
//    }
//
//    final int CGLIB$hashCode$3() {
//        return super.hashCode();
//    }
//
//    final String CGLIB$toString$2() {
//        return super.toString();
//    }
//
//    public final String addOrder(String str, String str2) {
//        MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_0;
//        if (methodInterceptor == null) {
//            CGLIB$BIND_CALLBACKS(this);
//            methodInterceptor = this.CGLIB$CALLBACK_0;
//        }
//        if (methodInterceptor == null) {
//            return super.addOrder(str, str2);
//        }
//        return (String) methodInterceptor.intercept(this, CGLIB$addOrder$0$Method, new Object[]{str, str2}, CGLIB$addOrder$0$Proxy);
//    }
//
//    protected final Object clone() throws CloneNotSupportedException {
//        MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_0;
//        if (methodInterceptor == null) {
//            CGLIB$BIND_CALLBACKS(this);
//            methodInterceptor = this.CGLIB$CALLBACK_0;
//        }
//        return methodInterceptor != null ? methodInterceptor.intercept(this, CGLIB$clone$4$Method, CGLIB$emptyArgs, CGLIB$clone$4$Proxy) : super.clone();
//    }
//
//    public final boolean equals(Object obj) {
//        MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_0;
//        if (methodInterceptor == null) {
//            CGLIB$BIND_CALLBACKS(this);
//            methodInterceptor = this.CGLIB$CALLBACK_0;
//        }
//        if (methodInterceptor == null) {
//            return super.equals(obj);
//        }
//        Object intercept = methodInterceptor.intercept(this, CGLIB$equals$1$Method, new Object[]{obj}, CGLIB$equals$1$Proxy);
//        return intercept == null ? false : ((Boolean) intercept).booleanValue();
//    }
//
//    public Callback getCallback(int i) {
//        CGLIB$BIND_CALLBACKS(this);
//        switch (i) {
//            case 0:
//                return this.CGLIB$CALLBACK_0;
//            default:
//                return null;
//        }
//    }
//
//    public Callback[] getCallbacks() {
//        CGLIB$BIND_CALLBACKS(this);
//        return new Callback[]{this.CGLIB$CALLBACK_0};
//    }
//
//    public final int hashCode() {
//        MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_0;
//        if (methodInterceptor == null) {
//            CGLIB$BIND_CALLBACKS(this);
//            methodInterceptor = this.CGLIB$CALLBACK_0;
//        }
//        if (methodInterceptor == null) {
//            return super.hashCode();
//        }
//        Object intercept = methodInterceptor.intercept(this, CGLIB$hashCode$3$Method, CGLIB$emptyArgs, CGLIB$hashCode$3$Proxy);
//        return intercept == null ? 0 : ((Number) intercept).intValue();
//    }
//
//    public Object newInstance(Callback callback) {
//        CGLIB$SET_THREAD_CALLBACKS(new Callback[]{callback});
//        OrderServiceImpl$$EnhancerByCGLIB$$48644490 orderServiceImpl$$EnhancerByCGLIB$$48644490 = new OrderServiceImpl$$EnhancerByCGLIB$$48644490();
//        CGLIB$SET_THREAD_CALLBACKS(null);
//        return orderServiceImpl$$EnhancerByCGLIB$$48644490;
//    }
//
//    public Object newInstance(Class[] clsArr, Object[] objArr, Callback[] callbackArr) {
//        CGLIB$SET_THREAD_CALLBACKS(callbackArr);
//        switch (clsArr.length) {
//            case 0:
//                OrderServiceImpl$$EnhancerByCGLIB$$48644490 orderServiceImpl$$EnhancerByCGLIB$$48644490 = new OrderServiceImpl$$EnhancerByCGLIB$$48644490();
//                CGLIB$SET_THREAD_CALLBACKS(null);
//                return orderServiceImpl$$EnhancerByCGLIB$$48644490;
//            default:
//                throw new IllegalArgumentException("Constructor not found");
//        }
//    }
//
//    public Object newInstance(Callback[] callbackArr) {
//        CGLIB$SET_THREAD_CALLBACKS(callbackArr);
//        OrderServiceImpl$$EnhancerByCGLIB$$48644490 orderServiceImpl$$EnhancerByCGLIB$$48644490 = new OrderServiceImpl$$EnhancerByCGLIB$$48644490();
//        CGLIB$SET_THREAD_CALLBACKS(null);
//        return orderServiceImpl$$EnhancerByCGLIB$$48644490;
//    }
//
//    public void setCallback(int i, Callback callback) {
//        switch (i) {
//            case 0:
//                this.CGLIB$CALLBACK_0 = (MethodInterceptor) callback;
//                return;
//            default:
//                return;
//        }
//    }
//
//    public void setCallbacks(Callback[] callbackArr) {
//        this.CGLIB$CALLBACK_0 = (MethodInterceptor) callbackArr[0];
//    }
//
//    public final String toString() {
//        MethodInterceptor methodInterceptor = this.CGLIB$CALLBACK_0;
//        if (methodInterceptor == null) {
//            CGLIB$BIND_CALLBACKS(this);
//            methodInterceptor = this.CGLIB$CALLBACK_0;
//        }
//        return methodInterceptor != null ? (String) methodInterceptor.intercept(this, CGLIB$toString$2$Method, CGLIB$emptyArgs, CGLIB$toString$2$Proxy) : super.toString();
//    }
//}