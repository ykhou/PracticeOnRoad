package com.kang.spring.mihoyo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] sw = new int[n][3];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 2) {
                sw[i][0] = 2;
            } else {
                sw[i][0] = 1;
                sw[i][1] = sc.nextInt();
                sw[i][2] = sc.nextInt();
            }
        }

        int i = 0, j = 0;
        for (; i < n && j < n;) {
            int x = sw[i][0];
            if (x == 2 && i <= j) {
                System.out.println("no reliquaries.");
            } else if (x == 2 && i > j){
                System.out.println(sw[j][1] + " " + sw[j][2]);
                j++;
            }
            i++;
            while (j < n && sw[j][0] != 1) {
                j++;
            }
            while (i < n && sw[i][0] != 2) {
                i++;
            }
        }
        if (j >= n && i < n) {
            for (int k = i; k < n; k++) {
                System.out.println("no reliquaries.");
            }
        }
    }
}
