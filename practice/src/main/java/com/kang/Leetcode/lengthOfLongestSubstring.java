package com.kang.Leetcode;

import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "dvdf";
        lengthOfLongestSubstring(s);
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> record = new HashSet<>();
        int right = 0, maxLength = 0;
        for (int left = 0; left < s.length(); left++) {
            if (left != 0) {
                record.remove(s.charAt(left - 1));
            }
            while (right < s.length() && !record.contains(s.charAt(right))) {
                record.add(s.charAt(right));
                right++;
            }
            maxLength = Math.max(maxLength, right - left);
        }
        return maxLength;
    }
}
