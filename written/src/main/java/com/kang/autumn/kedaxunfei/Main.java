package com.kang.autumn.kedaxunfei;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println(seqSum(3));
    }

    public static float seqSum (int n) {
        // write code here
        float[] dp = new float[n + 1];
        dp[0] = 1f;
        dp[1] = 2f;

        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        float sum = 0.00f;
        for (int i = 1; i < n + 1; i++) {
            sum += dp[i - 1] / dp[i];
        }
        BigDecimal bd = new BigDecimal(sum);
        bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }
}
