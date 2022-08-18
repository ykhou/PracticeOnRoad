package com.kang.spring.ali0407;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.nextLine();
        s = sc.nextLine();
        int count = backTracking(s, k, 0, 0);
        System.out.println(count);
    }

    private static int backTracking(String s, int k, int index, int count) {
        if (calCount(s) < 2) return count;
        count++;

        for (int i = index; i < s.length() - k; i++) {
            String temp = s.substring(index, i);
            s = s.substring(0, index) + s.substring(i);
            backTracking(s, k, i + 1, count);
            s = s.substring(0, index) + temp + s.substring(index);
        }
        return count;
    }

    private static int calCount(String ss) {
        Set<Character> record = new HashSet<>();
        int count = 0;
        for (char ch : ss.toCharArray()) {
            if (!record.contains(ch)) {
                record.add(ch);
                count++;
            }
        }
        return count;
    }
}
