package com.kang.practice;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("线程启动");
        }, "t1");

        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
//        ConcurrentHashMap
    }
}
