package com.kang.thread;

import java.util.concurrent.TimeUnit;

public class DeadLock {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();
        // 线程一拥有 lock1 试图获取 lock2
        new Thread(() -> {
            synchronized (lock1) {
                System.out.println("获取 lock1 成功");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 试图获取锁 lock2
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }).start();
        // 线程二拥有 lock2 试图获取 lock1
        new Thread(() -> {
            synchronized (lock2) {
                System.out.println("获取 lock2 成功");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 试图获取锁 lock1
                synchronized (lock1) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }).start();
    }
}
