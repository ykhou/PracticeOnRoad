package com.kang.xiecheng;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        long res = divideSeven(x);
        System.out.println(res);
//        System.out.println(Integer.MAX_VALUE);
    }

    private static long divideSeven(long num) {
        long newNum = 7;

        if (num == 0) newNum = 70;
        for (int i = 0; i < 10; i++) {
            if (num > 214748364) break;
            long temp = num;
            temp = temp * 10 + i;
            if (temp % 7 == 0) return temp;
        }

        for (int i = 0; i < 10; i++) {
            long temp = num;
            long a = num % 10;
            long b = num / 10;
            temp = b * 100 + i * 10 + a;
            if (temp % 7 == 0) return temp;
        }

        return newNum;
    }
}
