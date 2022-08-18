package com.kang.spring.weilai;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[][] p = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                p[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        int[][] dp = new int[n][m];
        dp[0][0] = p[0][0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + p[i][0];
//            System.out.println(dp[i][0]);
        }

        for (int j = 1; j < m; j++) {
            dp[0][j] = dp[0][j - 1] + p[0][j];
//            System.out.println(dp[0][j]);
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.min(dp[i-1][j]+p[i][j], dp[i][j-1] + p[i][j]);
//                System.out.println(dp[i][j]);
            }
        }
        System.out.println(dp[n-1][m-1]);
    }
}
