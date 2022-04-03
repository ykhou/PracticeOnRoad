package com.kang.xiecheng;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
//        System.out.println('a' - 'A');
//        System.out.println('A');
        Scanner sc = new Scanner(System.in);
        int hang = sc.nextInt();
        int lie = sc.nextInt();
        int n = sc.nextInt();
        String temp = sc.nextLine();
//        StringBuffer sb = new StringBuffer();
        String[] s = new String[hang];
        for (int i = 0; i < hang; i++) {
            s[i] = sc.nextLine();
//            sb.append(sc.nextLine());
        }
        char[][] chars = new char[hang][lie];

        int[][] count = new int[hang][lie];
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            for (int j = x1-1; j < x2; j++) {
                for (int k = y1-1; k < y2; k++) {
                    count[j][k]++;
                }
            }
        }
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < lie; j++) {
                chars[i][j] = s[i].charAt(j);
                if (count[i][j] % 2 != 0) {
                    if (chars[i][j] >= 'a') chars[i][j] = (char) (chars[i][j] - 32);
                    else chars[i][j] = (char) (chars[i][j] + 32);
                }
            }
        }

        for (int i = 0; i < hang; i++) {
            System.out.println(chars[i]);
        }
    }
}
