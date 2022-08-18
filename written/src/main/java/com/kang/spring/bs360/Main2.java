package com.kang.spring.bs360;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // n右三位数相乘
//        int r = 0, c = 0, l = 0;
        int max = 0;
        for (int i = 3; i < n; i++) {
            for (int j = 2, k = n; k >= j;) {
                int muti = (i - 2) * (j - 1) * (k - 2);
                if (muti > n) k--;
                else if (muti < n) j++;
                else max = Math.max(max, i * j * k - n);
                System.out.println(i * j * k);
            }
        }
        System.out.println(max);
    }
}
