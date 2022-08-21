package com.kang.autumn.meituan;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lenA = sc.nextInt();
        int lenB = sc.nextInt();
        int[] A = new int[lenA];
        int[] B = new int[lenB];
        for (int i = 0; i < lenA; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < lenB; i++) {
            B[i] = sc.nextInt();
        }

        int[][] dp = new int[lenA+1][lenB+1];
        for (int i = 1; i <= lenA; i++) {
            dp[i][0] = dp[i-1][0] + Math.abs(A[i-1]);
        }
        for (int i = 1; i <= lenB; i++) {
            dp[0][i] = dp[0][i-1] + Math.abs(B[i-1]);
        }

        for (int i = 1; i <= lenA; i++) {
            int a = A[i - 1];
            for (int j = 1; j <= lenB; j++) {
                int b = B[j - 1];
                if (a == b) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.min(dp[i-1][j] + Math.abs(A[j-1]), dp[i][j-1] + Math.abs(B[i-1]));
                }
            }
        }
        System.out.println(dp[lenA][lenB]);
    }
}
