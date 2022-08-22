package com.kang.autumn.xinghuan;

import java.util.Scanner;

public class Main2 {
    int maxLen = 0;
    static String[] allStr;
    static boolean[] vis;
    StringBuffer temp = new StringBuffer();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        allStr = new String[len];
        vis = new boolean[len];
        for (int i = 0; i < len; i++) {
            allStr[i] = sc.nextLine();
        }

        Main2 main2 = new Main2();
        main2.dfs(0, -1);
        System.out.println(main2.maxLen);
    }
    public void dfs(int count, int index) {
        if (index != -1) {
            temp.append(allStr[index]);
            int tempLen = temp.length();
            int x = tempLen - allStr[index].length();
            if (count > 1 && temp.charAt(x) != temp.charAt(x - 1)) {
                return;
            }

            if (temp.charAt(0) == temp.charAt(tempLen - 1)) {

                if (maxLen < tempLen) {
                    maxLen = tempLen;
                }
            }
            if (count == allStr.length) {
                return;
            }
        }

        for (int i = 0; i < allStr.length; i++) {
            if (vis[i]) {
                continue;
            } else {
                vis[i] = true;
                count++;
                dfs(count, i);
                int s = allStr[i].length();
                if (count > 0) {
                    temp.delete(temp.length() - s, temp.length());
                }
                count--;
                vis[i] = false;
            }
        }
    }
}
