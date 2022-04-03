package com.kang.meituan2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String banner = sc.nextLine();
        String idea = sc.nextLine();
        List<String> subBanner = getAllSubstrings(banner);
        int count = 0;
        for (String str : subBanner) {
            if (idea.equals(str)) count++;
        }
        System.out.println(count);
    }

    public static List<String> getAllSubstrings(String s){
        List<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < s.length() ; i++) {
            for (int j = i+1; j < s.length()+1 ; j++) {
                arrayList.add(s.substring(i, j));
            }
        }
        return arrayList;
    }
}
