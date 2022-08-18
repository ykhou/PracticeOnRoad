package com.kang.spring.tecentmusic;

public class Main3 {
    public static void main(String[] args) {

    }

    public int howMany (String S, int k) {
        // write code here
        int[] map = new int[26];
        int res = 0;
        for (char ch : S.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                map[ch - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (map[i] >= k) res++;
        }
        return res;
    }
}
