package com.kang.spring.jd;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] ps = new int[n][n];
        int max = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int p = sc.nextInt();
            ps[u-1][v-1] = p;
            max = Math.max(max, p);
            min = Math.min(min, p);
        }
//        int res = min;
        for (int k = max; k > min; k--) {
            int res = k;
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (ps[i][j] < k) flag = false;
                }
            }
            if (flag) continue;
            else System.out.println(res);
        }
    }
}
