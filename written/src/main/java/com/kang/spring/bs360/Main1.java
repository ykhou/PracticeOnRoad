package com.kang.spring.bs360;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int[] left = new int[n];
        int[] right = new int[n];
        // 注水左边
        left[0] = 0;
        for (int i = 1; i < n; i++) {
            if (h[i] > h[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                h[i] = 0;
            }
        }
        // 注水右边
        right[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (h[i] > h[i + 1]) {
                right[i] = right[i + 1] + 1;
            } else {
                right[i] = 0;
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            // 左边+右边+自身
            left[i] += right[i] + 1;
            max = Math.max(max, left[i]);
        }
        System.out.println(max);
    }

}
