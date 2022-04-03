package com.kang.microsoft;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ms {
    public static void main(String[] args) {
        String str = "ABB";
        ms main = new ms();
        main.backTracking(str);
        for (List r : main.res) {
            System.out.println(r);
        }
    }

    List<List<Character>> res = new ArrayList<List<Character>>();
    LinkedList<Character> temp = new LinkedList<Character>();
    List<Boolean> isUse = new ArrayList<Boolean>();
    public void backTracking(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!isUse.get(i) && str.charAt(i) != str.charAt(i-1)) { // 未使用
                temp.add(str.charAt(i));
                isUse.set(i, true);
                backTracking(str);
                res.add(new ArrayList<Character>(temp));
                // 回溯
                temp.removeLast();

            }

        }
    }

}
