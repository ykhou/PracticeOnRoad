package com.kang.spring.xiecheng;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int max = sc.nextInt();
        String s = sc.nextLine();
        s = sc.nextLine();

        int[][] res = new int[2][200000];
        int[] count = new int[length-2];
        for (int i = 0, j = 0; i < length; i++) {
            if (i != 0 && s.charAt(i) != s.charAt(i-1)) j++;
            res[0][j] = s.charAt(i) - 'a';
            res[1][j]++;
        }

        int temp = 0;
        for (int i = 0; i < length - max; i++) {
            for (int j = 0; j < max; j++) {
                count[i] += res[1][i+j];
            }
            for (int j = max; j < length; j++) {
                if (res[0][j] != res[0][i] || res[0][j] != res[0][i+1] || res[0][j] != res[0][i+2]) break;
                else if (res[0][j] == res[0][i] || res[0][j] == res[0][i+1] || res[0][j] == res[0][i+2]) count[i] += res[1][j];
            }
            temp = Math.max(temp, count[i]);
        }

        System.out.println(temp);
    }
}
