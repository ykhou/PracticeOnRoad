package com.kang.jd;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // a 坦克数
        // b 碉堡血量
        // c 一个碉堡炸毁坦克数
        // d 碉堡数量
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int sum = b * d;
        int count = 0;
        while (a > 0) {
            count++;
            sum -= a;
            d = sum % b == 0 ? sum / b : sum / b + 1;
            a = a - d * c;
            if (d <= 0) break;
        }
        if (a <= 0 && d > 0) count = -1;
        System.out.println(count);
    }
}
