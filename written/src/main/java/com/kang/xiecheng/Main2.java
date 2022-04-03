package com.kang.xiecheng;

import java.util.Scanner;
import java.util.concurrent.Executors;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = count(s);
        System.out.println(res);
    }

    private static int count(String s) {
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                dp[i] = dp[i-1] + i + 1;
            } else {
                dp[i] = dp[i-1];
            }
        }

        return dp[n];
//        Executors.newFixedThreadPool(4);
//        Executors.newCachedThreadPool();
    }
}
