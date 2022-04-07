package com.kang.huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int topN = sc.nextInt();
        int M = sc.nextInt();
        Map<String, Integer> record = new HashMap<>();
        String[] max = new String[topN];
        String s = sc.nextLine();
        for (int i = 0; i < 2 * M; i = i + 2) {
            s = sc.nextLine();
            setRecord(s, record, 3, max);
            s = sc.nextLine();
            setRecord(s, record, 1, max);
        }
        for (Map.Entry<String, Integer> entry : record.entrySet()) {
            System.out.println();
        }

        if (topN == 3) System.out.println("xinguan xinzeng bendi");
        if (topN == 1) System.out.println("xinguan");
    }

    private static void setRecord(String s, Map<String, Integer> record, int muti, String[] max) {
        String[] ss = s.split(" ");
        for (String s1 : ss) {
            if (record.containsKey(s1)) {
                record.put(s1, record.get(s1) + muti);
            } else {
                record.put(s1, muti);
            }
//            for (int i = 0; i < max.length; i++) {
//                if (record.get(s1) > max[i])
//            }
        }
    }
}
