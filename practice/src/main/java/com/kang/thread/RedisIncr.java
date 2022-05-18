package com.kang.thread;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class RedisIncr {

    private static final HashMap<String, Integer> map = new HashMap<>();

    private static final HashMap<String, AtomicInteger> map2 = new HashMap<>();

    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            new Thread(() -> {
                System.out.println(incr3("key1"));
            }).start();
        }
    }


    public static synchronized Integer incr(String key) {
        if (!map.containsKey(key)) {
            map.put(key, 0);
        }
        Integer temp = map.get(key);
        temp++;
        map.put(key, temp);
        return temp;
    }

    public static AtomicInteger incr2(String key) {
        AtomicInteger temp = new AtomicInteger(0);
        if (!map2.containsKey(key)) {
            map2.put(key, temp);
        }
        temp = map2.get(key);
        temp.getAndIncrement();
        map2.put(key, temp);
        return temp;
    }
    public static Integer incr3(String key) {
        if (!map.containsKey(key)) {
            map.put(key, 0);
        }
        Integer temp = map.get(key);
        temp++;
        map.put(key, temp);
        return temp;
    }
}
