package com.kang.wangyi0327;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
//        if (length < 2) {
//            System.out.println(0);
//        }
        int[] dp = new int[length];
        dp[0] = 0;
        if (length > 1) dp[1] = score(str.charAt(0), str.charAt(1));
        for (int i = 2; i < length; i++) {
            if (Math.abs(str.charAt(i) - str.charAt(i-1)) <= 1) {
                dp[i] = Math.max(dp[i-2] + score(str.charAt(i), str.charAt(i-1)), dp[i-1]);
            } else {
                dp[i] = dp[i-1];
            }
        }
        if (length < 2) System.out.println(0);
        else System.out.println(dp[length - 1]);
    }

    private static int score(char first, char second) {
        int res = 0;
        int fs = first - 'a' + 1;
        int ss = second - 'a' + 1;
        if (first == second) {
            res = fs + ss;
        } else if (Math.abs(first - second) == 1) {
            res = fs + ss;
        }
        return res;
    }
}
