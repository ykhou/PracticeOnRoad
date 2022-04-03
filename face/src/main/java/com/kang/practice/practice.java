package com.kang.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// ABC -> A B C AB AC BC ABC
public class practice {
    public static void main(String[] args) {
        String s = "ABC";
        backTracking(s, 0);
        for (String r : res) {
            System.out.println(r);
        }
    }
    static List<String> res = new ArrayList<String>();
    static StringBuffer sb = new StringBuffer();
    static void backTracking(String s, int startIndex) {
        res.add(sb.toString());
        if (startIndex >= s.length()) {
            return;
        }

        for (int i = startIndex; i < s.length(); i++) {
            sb.append(s.charAt(i));
            backTracking(s, i + 1);
            sb.deleteCharAt(i);
        }
    }
}
