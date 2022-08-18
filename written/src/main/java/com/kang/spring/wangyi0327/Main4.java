package com.kang.spring.wangyi0327;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] cost = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cost[i][j] = sc.nextInt();
            }
        }
        int[][] dp = new int[n][m];
        for (int i = 1; i < m; i++) {
            if (cost[0][i] == cost[0][i-1]) {
                dp[0][i] = dp[0][i-1] + 1;
            } else {
                dp[0][i] = dp[0][i-1] + 2;
            }
        }
        for (int i = 1; i < n; i++) {
            if (cost[i][0] == cost[i-1][0]) {
                dp[i][0] = dp[i-1][0] + 1;
            } else {
                dp[i][0] = dp[i-1][0] + 2;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.min(dp[i][j-1] + (cost[i][j] == cost[i][j-1] ? 1 : 2),
                        dp[i-1][j] + (cost[i][j] == cost[i-1][j] ? 1 : 2));
            }
        }
        System.out.println(dp[n-1][m-1]);
    }

}
