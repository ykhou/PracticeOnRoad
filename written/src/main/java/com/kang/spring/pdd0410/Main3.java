package com.kang.spring.pdd0410;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int useCount = sc.nextInt();
        int allCount = sc.nextInt();
        boolean[] used = new boolean[allCount];
        for (int i = 0; i < useCount; i++) {
            int temp = sc.nextInt();
            used[temp] = true;
        }
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            boolean flag = false;
            while (left <= right) {
                if (!used[left]) {
                    System.out.println(left);
                    flag = true;
                    break;
                } else left++;
            }
            if (!flag) System.out.println(-1);
        }
    }
}
