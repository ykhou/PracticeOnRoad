package com.kang.meituan2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static List<String> subBanner = new ArrayList<>();
    public static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String banner = sc.nextLine();
        String idea = sc.nextLine();
        boolean[] used = new boolean[banner.length()];
        backTrading(banner, 0, used);

    }

    private static void backTrading(String str, int index, boolean[] used) {
        subBanner.add(sb.toString());
        if (index >= str.length()) return;

        for (int i = index; i < str.length(); i++) {
            sb.append(str.charAt(i));
            used[i] = true;
            if (i != 0 && used[i - 1] == false) {
                sb.deleteCharAt(i);
                used[i] = false;
                continue;
            }
            backTrading(str, i + 1, used);
            sb.deleteCharAt(i);
            used[i] = false;
        }
    }
}
