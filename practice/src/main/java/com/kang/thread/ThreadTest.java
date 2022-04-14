package com.kang.thread;

import java.util.*;

public class ThreadTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("函数式接口");
            }
        });
        thread.start();

        Collections.sort(Arrays.asList(1, 2, 4), new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
    }
}
