package com.example.hashmap;

/**
 * jdk1.7实现方式：数组＋链表
 * 如果key值不冲突，时间复杂度为o(1)，直接根据下标查询
 * 如果key值冲突，时间复杂度为o(n)
 */
public class ExtHashMap<K, V> {

    //hashmap底层默认初始长度为16
    private Entry[] entries = new Entry[10000];

    /**
     * 数组＋链表方式实现
     * @param <K>
     * @param <V>
     */
    class Entry<K,V> {
        K k;
        V v;
        Entry<K,V> next;

        public Entry(K k, V v) {
            this.k = k;
            this.v = v;
        }
    };

    public void put(K k, V v){
        //数组＋链表实现 hash算法
        int index = k == null ? 0 : k.hashCode() % entries.length;
        //判断key是否发生冲突
        Entry oldEntry = entries[index];
        if (null == oldEntry) {
            //key没有发生冲突，直接存
            entries[index] = new Entry(k,v);
        } else {
            oldEntry.next = new Entry(k,v);
        }
    };

    public V get(K k){
        //数组＋链表实现 hash算法
        int index = k == null ? 0 : k.hashCode() % entries.length;
        for (Entry oldEntry = entries[index] ;oldEntry != null ;oldEntry = oldEntry.next) {
            if ((null == k && oldEntry.k == null) || oldEntry.k.equals(k)) {
                return (V) oldEntry.v;
            }
        }

        return (V) entries[index].v;
    };

    public static void main(String[] args) {
        ExtHashMap<Object,String> map = new ExtHashMap<>();
        map.put("a","a");
        map.put(97,"97");
        map.put(null,"ceshi");
        System.out.println(map.get("a"));
        System.out.println(map.get(97));
        System.out.println(map.get(null));
    }
}
