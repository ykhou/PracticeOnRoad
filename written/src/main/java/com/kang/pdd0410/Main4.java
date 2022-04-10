package com.kang.pdd0410;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // 车辆数
        int n = sc.nextInt(); // 一次摆渡的车的个数
        int x = sc.nextInt(); // 一次所花费时间
        int[] times = new int[m];
        for (int i = 0; i < m; i++) {
            times[i] = sc.nextInt();
        }
        Arrays.sort(times);
        int lastTime = 0;
        // 0 20 30
        for (int i = 1; i < m; i++) {
            if (times[i] - times[i - 1] <= x) {
                lastTime += x;
            }
        }
    }
}
