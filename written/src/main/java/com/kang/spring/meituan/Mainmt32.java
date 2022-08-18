package com.kang.spring.meituan;

import java.util.*;

public class Mainmt32 {
    List<List<Integer>> res = new LinkedList<List<Integer>>();
    ArrayList<Integer> temp = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] interval = new int[n][2];
        int i = 0;
        while (i < n) {
            interval[i][0] = sc.nextInt();
            interval[i][1] = sc.nextInt();
            i++;
        }

//        Arrays.sort(interval, (a, b) -> {
//            return Integer.compare(a[0], b[0]);
//        });

        int count = 0;
        int pre = interval[0][1];
        for (int j = 1; j < interval.length; j++) {
            if (pre < interval[j][0]) {
                count++;
                pre = interval[j][1];
            } else {
                pre = interval[j-1][1];
            }
        }
        System.out.println(count);

    }
}
