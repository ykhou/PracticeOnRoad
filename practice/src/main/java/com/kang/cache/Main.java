package com.kang.cache;

public class Main {
    public static void main(String[] args) throws Exception {
        LFUCache localCache = new LFUCache(16);

        for (int i = 0; i < 3; i++) {
            localCache.put("01" + i, "张三" + i,2 * 60);
        }
        localCache.get("010");
        localCache.get("011");
        localCache.get("010");
        localCache.put("013","李四",2 * 60);

        for (int i = 0; i < 4; i++) {
            System.out.println(localCache.get("01" + i));
        }
    }
}
