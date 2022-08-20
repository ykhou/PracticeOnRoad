package com.kang.autumn.Microsoft;

import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        System.out.println(solution("398782346432"));
    }

    static int n;
    static char[] chars;
    static boolean[] vis;
    static String  max;

    public static String solution(String S) {
        n = S.length();
        chars = S.toCharArray();
        Arrays.sort(chars);
        vis = new boolean[n];
        max = "";
        backtrack(0, "");
        return String.valueOf(max);
    }

    static void backtrack(int a, String s) {
        if (a <= n) {
            boolean palindrome = isPalindrome(s);
            int len = s.length();
            if (palindrome && !"".equals(s) && s.charAt(0) != '0') {
//                Long value = Long.valueOf(s);
//                System.out.println(s);
//
//                if (value > max) {
//                    max = value;

                if (len > max.length()) {
                    max = s;
                } else if (s.length() == max.length()) {
                    for (int i = 0; i < len;) {
                        int j = Math.min(i + 8, len);
                        int maxCur = Integer.valueOf(max.substring(i, j));
                        int sCur = Integer.valueOf(s.substring(i, j));
                        if (sCur > maxCur) {
                            max = s;
                            break;
                        }
                        i = j;
                    }
                }
            }
            // res.add(s);
        }
        if (a == n) {
            return;
        }
        for (int i = 0; i < n; i++) {
            if (vis[i] || i > 0 && chars[i] == chars[i-1] && !vis[i-1]) {
                continue;
            }
            vis[i] = true;
            backtrack(a + 1, s + chars[i]);
            vis[i] = false;
        }
    }

    public static boolean isPalindrome(String s) {
        StringBuffer sgood = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sgood.append(Character.toLowerCase(ch));
            }
        }
        int n = sgood.length();
        int left = 0, right = n - 1;
        while (left < right) {
            if (Character.toLowerCase(sgood.charAt(left)) != Character.toLowerCase(sgood.charAt(right))) {
                return false;
            }
            ++left;
            --right;
        }
        return true;
    }
}
