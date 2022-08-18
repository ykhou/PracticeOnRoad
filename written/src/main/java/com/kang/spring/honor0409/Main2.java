package com.kang.spring.honor0409;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 != 0) System.out.println(0);
        else {
            int a = n / 2;
            int b = n / 2;
            while (a >= 2) {
                if (a % 2 == 0 || b % 2 == 0) {
                    a--;
                    b++;
                } else if ((a % 3 == 0 && a / 3 != 1) || (b / 3 != 1 && b % 3 == 0)) {
                    a--;
                    b++;
                } else {
                    System.out.println(a + " " + b);
                    break;
                }
            }
        }
    }
}
