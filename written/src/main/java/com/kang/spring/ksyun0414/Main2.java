package com.kang.spring.ksyun0414;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double x = sc.nextLong();
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//        Double result =  (1 / x);
//        long res = (long) (result * Math.pow(10, m + n - 1) % Math.pow(10, n));
//        System.out.println(res);

        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long d = sc.nextLong();
        long n = sc.nextLong();
        long a = 10, b = d - 1;
        long res = 1;

        while (b > 0) { // 快速幂
            if ((b & 1) == 1) {
                res = res * a % x;
            }
            a = a * a % x;
            b >>= 1;
        }
        for (long i = d; i < n + d; ++i) {
            res *= 10;
            System.out.print(res / x);
            res %= x;
        }
    }
}
