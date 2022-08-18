package com.kang.spring.tecent0424;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (price[i] >= price[i - 1] && m - price[i - 1] >= 0) {
                m -= price[i - 1];
                count++;
            } else {
                if (count > 0) {
                    m += price[i - 1];
                    count--;
                }
            }
        }
        System.out.println(m + count * price[n - 1]);
    }
}
