package com.kang.bf;

import org.redisson.Redisson;
import org.redisson.api.RBloomFilter;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

public class RedisMain {
    public static void main(String[] args) {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:6379");
        // 构造redisson
        RedissonClient redissonClient = Redisson.create(config);
        RBloomFilter<String> bloomFilter = redissonClient.getBloomFilter("bloom");
        bloomFilter.tryInit(1000000L, 0.01);
        bloomFilter.add("kang");

        System.out.println(bloomFilter.contains("kang"));
        System.out.println(bloomFilter.contains("hou"));
    }
}
