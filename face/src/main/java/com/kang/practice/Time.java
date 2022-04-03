package com.kang.practice;

public class Time {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(l);
        System.out.println(l % 100_0000);
        System.out.println(String.format("%06d", l % 100_0000));
    }
}
