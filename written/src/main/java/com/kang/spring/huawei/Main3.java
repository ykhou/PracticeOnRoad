package com.kang.spring.huawei;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int needLength = sc.nextInt();
        int n = sc.nextInt();
        String s = sc.nextLine();
        s = sc.nextLine();
        String[] ss = s.split(",");
        int[][] record = new int[n+1][2];
        int[] allLength = new int[n+1];
        for (int i = 1; i < n + 1; i++) {
            record[i][0] = Integer.parseInt(ss[i-1]);
            if (record[i][0] < 0) {
                record[i][1] = record[i-1][1] + 1;
                record[i-1][1] = 0;
            }
        }
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            count += record[i][1] / needLength;
        }
        System.out.println(count);
    }
}
