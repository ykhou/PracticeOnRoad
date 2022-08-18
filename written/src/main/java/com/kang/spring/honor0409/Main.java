package com.kang.spring.honor0409;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) System.out.println(n);
        else if ( n == 2) System.out.println(4);
        else if (n == 3) System.out.println(10);
        else {
            int[] dpUnused = new int[n + 1];
            dpUnused[1] = 1;
            dpUnused[2] = 2;
            int[] dpUsed = new int[n + 1];
            dpUsed[1] = 1;
            dpUsed[2] = 4;
            dpUsed[3] = 10;
            for (int i = 3; i < n + 1; i++) {
                dpUnused[i] = dpUnused[i - 1] + dpUnused[i - 2];
            }
            for (int i = 4; i < n + 1; i++) {
                dpUsed[i] = dpUnused[i - 1] * 2 + dpUnused[i - 2] + dpUsed[i - 1] + dpUsed[i - 2];
            }
            System.out.println(dpUsed[n]);
        }
    }
}
