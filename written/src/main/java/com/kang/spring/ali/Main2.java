package com.kang.spring.ali;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[5];
        long[] res = new long[n];
        String s = sc.nextLine();
        for (int i = 0; i < n; i++) {
            long min1 = 0, min2 = 0;
            for (int j = 0; j < 5; j++) {
                arr[j] = sc.nextInt();
            }
            String temp = sc.nextLine();
            Arrays.sort(arr);
            min1 = arr[0] + arr[1];
            min2 = arr[2];
//            System.out.println(min1 > min2 ? min2 : min1);
            res[i] = min1 > min2 ? min2 : min1;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(res[i]);
        }
    }
}
