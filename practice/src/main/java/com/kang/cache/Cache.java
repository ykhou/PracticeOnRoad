package com.kang.cache;

import lombok.Data;

@Data
// 缓存对象
public class Cache implements Comparable<Cache> {
    private Object key;

    private Object value;

    private long accessTime;

    private long writeTime;

    private long expireTime;

    private Integer hitCount;

    public int compareTo(Cache o) {
        return 0;
    }
}
