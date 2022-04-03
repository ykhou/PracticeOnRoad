package com.kang.wangyi;

import java.util.Scanner;

public class Mainwy1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int[][] res = new int[3][3];
            for (int j = 0; j < 3; j++) {
                String s = sc.next();
                for (int k = 0; k < 3; k++) {
                    res[j][k] = s.charAt(k) == '*' ? 0 : s.charAt(k) - 48;
                }
            }
            int[][] gong = new int[3][3];
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    gong[j][k] = j;
                }
            }

            for (int j = 0; j < n; j++) {
                System.out.println("No");
            }
        }
    }

    public static void findRes(int[][] res, int[][] gong) {

    }
}
