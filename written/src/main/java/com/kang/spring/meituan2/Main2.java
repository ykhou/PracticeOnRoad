package com.kang.spring.meituan2;

import java.util.Scanner;

// 单峰数组
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxValue = 0;
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp >= maxValue) {
                maxValue = temp;
                maxIndex = i;
            }
            arr[i] = temp;
        }
        int sum = 0;
        int temp = arr[0];
        for (int i = 1; i < maxIndex; i++) {
            if (arr[i] <= temp) {
                int add = temp - arr[i] + 1;
                arr[i] += add;
                sum += add;
            }
            temp = arr[i];
        }
        temp = arr[n - 1];
        for (int i = n - 2; i > maxIndex; i++) {
            if (arr[i] >= temp) {
                int add = arr[i] - temp + 1;
                arr[i] += add;
                sum += add;
            }
            temp = arr[i];
        }
        System.out.println(sum);
    }
}
