package com.kang.spring.mihoyo;

import java.util.Scanner;

public class Mainmhy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int m = sc.nextInt();
            int first = sc.nextInt();
            String temp = sc.nextLine();
            int count = 0;
            for (int i = 0; i < m; i++) {
                int value = sc.nextInt();
                if (first == value) {
                    count = i;
                }
            }
            System.out.println(count > m - count ? m - count : count);
        }
    }
}
