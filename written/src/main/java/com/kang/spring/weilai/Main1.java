package com.kang.spring.weilai;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        int pre = 0, max = list[0];
        for (int x : list) {
            pre = Math.max(pre + x, x);
            max = Math.max(max, pre);
        }
        System.out.println(max);
    }
}
