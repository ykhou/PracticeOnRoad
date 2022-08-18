package com.kang.spring.meituan2;

import java.util.Scanner;

// 红球和蓝球
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int b = sc.nextInt();
        String str = sc.nextLine();
        str = sc.nextLine();
        int needRed = 0;
        int needBlue = 0;
        char temp = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (temp != str.charAt(i)) continue;
            else if (str.charAt(i) == 'r') needRed++;
            else if (str.charAt(i) == 'b') needBlue++;
            temp = str.charAt(i);
        }
        if (needRed <= r && needBlue <= b) {
            System.out.println(n + needRed + needBlue);
        } else {
            System.out.println(
                    ((r - needRed) >= 0 ? 0 : (needRed - r)) +
                    " " +
                    ((b - needBlue) >= 0 ? 0 : (needBlue - b)));
        }
    }
}