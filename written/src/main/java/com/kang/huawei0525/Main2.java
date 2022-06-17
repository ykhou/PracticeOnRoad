package com.kang.huawei0525;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] son = son(N);
        int[] farther = farther(N);
        int res = 0;
        for (int i = 1; i <= N; i++) {
            res += son[i] * farther[N + 1 - i];
        }
        System.out.println(res);
    }

    public static int[] son(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        if (n <= 1) return dp;
        for (int index = 2; index <= n; index++) {
            dp[index] = dp[index-1] + dp[index-2];
        }
        return dp;
    }
    public static int[] farther(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        if (n <= 2) return dp;
        for (int index = 3; index <= n; index++) {
            dp[index] = dp[index-1] + dp[index-2] + dp[index-3];
        }
        return dp;
    }
}
