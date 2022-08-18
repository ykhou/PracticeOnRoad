package com.kang.spring.wangyi0327;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        nums(n , list, 0);
        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");
        }
    }

    private static void nums(int n, int[] arr, int startIndex) {
        if (startIndex == n) return;

        for (int i = 1; i < n + 1; i++) {
            arr[i] = i;
            if (i >= 1 && (arr[i] * arr[(i-1)/2]) % 2 == 0) {

            } else break;
            if ( i >= 2 && (arr[i] * arr[(i-2)/2]) % 2 == 0) {

            } else break;
            nums(n, arr, i + 1);
            arr[i] = 0;
        }
    }
    private static void nums2(int n, int[] arr) {
//        if (n % 2 == 0)
    }
}
