package com.example.hashmap;

import sun.net.util.IPAddressUtil;

import java.util.ArrayList;
import java.util.List;


/**
 * 优点：不需要考虑hash冲突问题。
 * 缺点：查询效率低，时间复杂度为O(n)
 * @param <K>
 * @param <V>
 */
public class ArrayListHashMap<K,V> {
    private List<Entry<K,V>> entries = new ArrayList<>();

    class Entry<K,V> {
        K k;
        V v;

        public Entry(K k, V v) {
            this.k = k;
            this.v = v;
        }
    }

    public void put(K k, V v){
        entries.add(new Entry<K,V>(k,v));
    }

    public V get(K k){
        for (Entry e :
                entries) {
            if (e.k.equals(k))
                return (V) e.v;
        }
        return null;
    }


    public static void main(String[] args) {
        ArrayListHashMap arrayListHashMap = new ArrayListHashMap();
        arrayListHashMap.put("a","a");
        arrayListHashMap.put("b","a");
        arrayListHashMap.put(97,"97");

        System.out.println(arrayListHashMap.get("a"));
        System.out.println(arrayListHashMap.get("b"));

        System.out.println(arrayListHashMap.get(97));
    }
}
