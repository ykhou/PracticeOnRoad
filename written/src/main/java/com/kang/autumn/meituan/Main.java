package com.kang.autumn.meituan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        String A = sc.nextLine();
        String B = sc.nextLine();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sb.append(A.charAt(i));
            sb.append(B.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
