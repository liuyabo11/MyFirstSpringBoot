package com.example.test;

import com.example.bean.PerSion;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class TestHashCode {
    public static void main(String[] args) {
        /**
         * hashcode方法，底层采用c语言编写，根据对象内存地址转换成整数类型
         * public native int hashCode();
         */

       /* //如果两个对象的hashcode值相等，内容值不一定相等
        String a = "a";
        Integer b = 97;
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        //如果使用equals方法比较两个对象内容值相等的情况下，则两个对象的hashcode值相等

        PerSion perSion1 = new PerSion("xiaoming",12);
        PerSion perSion2 = new PerSion("xiaoming",12);
        //比较的是内存地址，肯定不相等
        System.out.println(perSion1 == perSion2);
        //如果PerSion不重写equals方法，输出false，因为Object的equals默认是==
        //如果PerSion重写equals方法，输出true，因为重写之后，比较的是对象的内容是否一样，一样返回true,不一样才返回false
        System.out.println(perSion1.equals(perSion2));


        //如果persion重写了hashcode方法，就相等。如果不重写就不相等
        System.out.println(perSion1.hashCode());
        System.out.println(perSion2.hashCode());*/

        /**
         * 为什么重写了equals方法，还要重写hashcode方法？
         * 1.为了满足定律：
         * 如果两个对象的hashcode值相等，内容值不一定相等
         * 如果使用equals方法比较两个对象内容值相等的情况下，则两个对象的hashcode值相等
         * 2.hashmap底层判断key重复，set集合存储不重复对象。都是根据equals和hashcode值进行判断。
         * 3.如果使用自定义对象作为Map的key时，一定要重写equals和hashcode方法。
         * 4.避免内存泄漏，导致内存溢出。
         */


        /**
         * hashmap1.7实现方式？key为null存在什么位置？
         * 1.数组＋链表
         * 2.key为null存放在数组下标为0的位置。
         */


        /**
         * hash碰撞，hash冲突产生的原因？
         * 1.hashcode值相同，内容值不同。
         * 解决办法：
         * 1.jdk1.7使用数组＋链表（单向链表）
         * 不使用红黑树，链表长度过长的话，效率会低。
         * 2.jdk1.8使用数组＋链表＋红黑树
         * 数组长度>=64且链表长度 大于8 转成红黑树
         * 红黑树节点个数<6转为链表
         */


        /**
         * 时间复杂度O(1),O(n),O(LogN)
         * 1.O(1):只需要查询一次。使用数组下标查询。查询效率高。
         * 2.O(n):从头查到尾，循环，查询效率低。ArrayList查询。
         * 3.O(LogN)：平方，二插树，红黑树。
         */

        /**
         * hashmap根据key查询的时间复杂度？
         * 1.hash key值不冲突时，时间复杂度为O(1)
         * 2.hash key值冲突时，如果是数组＋链表，时间复杂度为O(n)
         * 3.hash key值冲突时，如果是数组＋链表+红黑树，时间复杂度为O(LogN)
         */

        /**
         * hashmap底层是有序存放的吗？
         * 1.无需 散列存放 不保证连续性
         * 2.遍历的时候是取出所有的链表，再循环。效率低。不适合遍历所有。
         * 3.单向链表
         * 为什么hashmap集合没有保证存放顺序？
         * 1.如果保证顺序，效率会更低
         * linkedhashmap和treemap底层如何实现有序的？
         * 1.底层使用双向链表，头尾相连
         * 2.存放时效率会慢慢变低。
         */


        /**
         *  分析jdk1.8hashmap源码？
         *  核心参数
         *  #初始化容量，左移效率高
         *  1.static final int DEFAULT_INITIAL_CAPACITY = 1 << 4
         *  #最大容量 2^30
         *  2.static final int MAXIMUM_CAPACITY = 1 << 30
         *  #加载因子 如果size>16*0.75=12
         *  3.static final float DEFAULT_LOAD_FACTOR = 0.75f
         *  #链表长度大于8的情况下，将链表转为红黑树
         *  4.static final int TREEIFY_THRESHOLD = 8
         *  #红黑树个数小于6的情况下，将红黑树转为链表
         *  5.static final int UNTREEIFY_THRESHOLD = 6;
         *  #数组容量大于等于64
         *  6.static final int MIN_TREEIFY_CAPACITY = 64
         *
         *  底层单向链表：
         *  final int hash;
         *  final K key;
         *  V value;
         *
         *  transient不能序列化
         *
         *  #
         *  transient int modCount;
         *
         *
         *  jdk1.7在扩容的时候会发生死循环？
         *  1.jdk1.7扩容的时候是头插法，单线程没有问题
         *  2.
         */

//        HashMap<String,String> map = new HashMap<>();
//        for (int i=0;i<100;i++) {
//            map.put(i+"",i+"");
//        }
//        map.forEach((k,v)->{
//            System.out.println("k"+k+"===>"+"v"+v);
//        });


        /**
         * hashmap如何避免内存泄露问题？
         * 1.自定义对象作为Map的key时，一定要重写equals和hashcode方法。
         */

        /**
         * hashmap和hashtable区别？
         * 1.hashmap线程不安全。效率高。允许存放key为null，放在数组的第0个位置。
         */

        /**
         * hashmap底层实现方式？
         * 1.基于arraylist
         * 优点：不需要考虑hash冲突问题。
         * 缺点：查询效率低，时间复杂度为O(n)
         * 2.基于数组＋链表(jdk1.7)
         * 3.基于数组＋链表+红黑树（jdk1.8）
         */


        /**
         * 二进制左移<<，右移>>
         * ^异或运算，针对2进制，相同为0，不同为1
         * &与运算，针对2进制，00得0，11得1，01得0（相等为本身，不同为0）
         *
         */

//        HashMap<String,String> map1 = new HashMap<>();
//        map1.put("test","test");HashMap<String,String> map1 = new HashMap<>();
//        map1.put("test","test");
        /**
         * 秒杀抢购扣库存10万次，如何提高消费者速度？
         * 1.消费者做集群
         * 2.批量获取
         * 微服务接口限流框架思想？
         * 线程池
         */

        Node<String,String> node1 = new Node<String,String>("1","1");
        Node<String,String> node2 = new Node<String,String>("2","2");
        Node<String,String> node3 = new Node<String,String>("3","3");
        Node<String,String> node4 = new Node<String,String>("4","4");
        node1.next = node2;
        node2.next = node3;

        if (null != node1) {
            node1.next = node4;
        }

        System.out.println(node1.next.getKey());
        node1.next.getKey();

        ConcurrentHashMap a = new ConcurrentHashMap();

    }

    static  class Node<K,V>{
        K key;
        V value;
        Node<K,V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

}
