package com.kang.spring.ali;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> res = new HashSet<>();
        String temp = sc.nextLine();
        for (int i = 0; i < n + 1; i++) {
            String s = sc.nextLine();
            if (!isValidLength(s)) continue;
            if (!isValidChar(s)) continue;
            isUsed(s, res);
        }
    }

    private static boolean isValidLength(String s) {
        int length = s.length();
        if (length >= 6 && length <= 12) {
            return true;
        } else {
            System.out.println("illegal length");
            return false;
        }
    }

    private static boolean isValidChar(String s) {
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') ;
            else if (ch >= 'A' && ch <= 'Z') ;
            else {
                System.out.println("illegal character");
                return false;
            }
        }
        return true;
    }

    private static void isUsed(String s, Set<String> res) {
        if (res.contains(s)) {
            System.out.println("account existed");
        } else {
            res.add(s);
            System.out.println("registration complete");
        }
    }
}
