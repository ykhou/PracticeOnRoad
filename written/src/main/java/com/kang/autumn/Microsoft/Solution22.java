package com.kang.autumn.Microsoft;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Solution22 {
    public static void main(String[] args) {
        System.out.println(new Solution22().solution("39878234234323333333336432"));
    }

    public String solution(String S) {
        StringBuilder res = new StringBuilder();
        HashMap<Character,Integer> fre = new HashMap<>();
        List<Integer> one = new ArrayList<>();
        List<Integer> more = new ArrayList<>();
        for(int i = 0; i < S.length(); ++i){
            char c = S.charAt(i);
            fre.put(c, fre.getOrDefault(c,0) + 1);
        }
        for(char ch : fre.keySet()){
            if(fre.get(ch) > 1){
                one.add(Integer.parseInt(String.valueOf(ch)));
            }else{
                more.add(Integer.parseInt(String.valueOf(ch)));
            }
        }
        one.sort(Comparator.reverseOrder());
        int offset = 0;
        while(one.size() > 0){
            int num = one.remove(0);
            if(num== 0 && res.length() == 0) {
                break;
            }
            char ch = (char) (num + 48);
            int count = fre.get(ch);

            while(count > 1){
                res.insert(offset,num);
                res.insert(res.length()-offset,num);
                offset++;
                count -= 2;
            }
            if(count == 1) {
                more.add(Integer.parseInt(String.valueOf(num)));
            }
        }
        more.sort(Comparator.reverseOrder());
        if(more.size()>0) {
            res.insert(res.length() / 2, more.get(0));
        }
        if(res.length() == 0) {
            return "0";
        }
        return res.toString();
    }
}
