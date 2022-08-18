package com.kang.spring.honor0409;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int days = sc.nextInt();
            int[] count = new int[days];
            int max = 0;
            int cur = 0;
            for (int j = 0; j < days; j++) {
                count[j] = sc.nextInt();
                if (j != 0) {
                    int todayScore = score(count, j);
                    cur = cur + todayScore;
                    max = Math.max(max, cur);
                }
            }
            System.out.println(max + " " + cur);
        }
    }

    private static int score(int[] count, int day) {
        int add = 0;
        int jian = 0;
        for (int i = 0; i < day; i++) {
            if (count[i] < count[day]) add++;
            else if (count[i] > count[day]) jian++;
        }
        return add - jian;
    }
}
