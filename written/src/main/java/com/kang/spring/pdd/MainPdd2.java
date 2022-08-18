package com.kang.spring.pdd;

import java.util.Scanner;

public class MainPdd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int count = 0, length;
            String str = "aabb";
            if (sc.hasNextInt()) {
                count = sc.nextInt();
                length = sc.nextInt();
                str = sc.nextLine();
            }
            int res = changeStr(str, count);
            System.out.println(res);
        }

    }

    public static int changeStr(String str, int count) {
        if (count ==0) return 0;
        StringBuffer sb1 = new StringBuffer(str);
        StringBuffer sb2 = new StringBuffer(str).reverse();
        for (int i = 0; i < count; i++) {
            StringBuffer sbTemp = sb1;
            sb1 = sb1.append(sb2);
            sb2 = sb2.append(sbTemp);
        }
        return sb1 == sb2 ? 1 : 2;
    }
}
