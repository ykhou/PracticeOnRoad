package com.kang.spring.meituan;

import java.util.*;

public class Mainmt3 {
    List<List<Integer>> res = new LinkedList<List<Integer>>();
    ArrayList<Integer> temp = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] interval = new int[n][2];
        int i = 0;
        while (i < 0) {
            interval[i][0] = sc.nextInt();
            interval[i][1] = sc.nextInt();
            i++;
        }

//        Arrays.sort(interval, (a, b) -> {
//            if (a[0] == b[0]) return a[1] - a[1];
//            return a[0] - b[0];
//        });

        int count = 0;
        int edge = Integer.MIN_VALUE;
        for (int j = 0; j < interval.length; i++) {
            if (edge <= interval[j][0]) {
                edge = interval[i][1];
            } else {
                count++;
            }
        }
        System.out.println(count);

    }
}
