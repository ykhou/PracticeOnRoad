package com.kang.baidu0412;

import java.util.Scanner;

public class Main2 {
    /**
     * 6 14 22
     * 2 11 20
     * 4 11 18
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        int[] add = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
            add[i] = sc.nextInt();
        }
        int countPrice = 0;
        for (int i = 0; i < n / 2; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    if (i != 0) {
                        price[j] += add[j];

                    }
                }
            }
        }
    }

//    private static int[] minAndMax(int[] price) {
//        int[] res = new int[2];
//        int min = Integer.MAX_VALUE;
//        int max = 0;
//        for (int i = 0; i < price.length; i++) {
//            min = Math.min(min, price[i] == 0 ? min : price[i]);
//        }
//    }
}
