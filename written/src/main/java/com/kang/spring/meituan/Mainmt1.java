package com.kang.spring.meituan;

import java.util.Scanner;

public class Mainmt1 {
    public static void main(String[] args) {
        Mainmt1 lucky = new Mainmt1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int num = sc.nextInt();
            String res = lucky.isLucky(num);
            System.out.println(res);
        }
    }

    public String isLucky(int num) {
        if (num % 11 == 0) return "yes";

        int count = 0;
        while (num != 0) {
            int temp = num % 10;
            if (temp == 1) count++;
            num /= 10;
        }

        if (count >= 2) return "yes";

        return "no";
    }
}
