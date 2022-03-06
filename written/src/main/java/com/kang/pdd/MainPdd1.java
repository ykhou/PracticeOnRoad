package com.kang.pdd;

import java.util.Scanner;

public class MainPdd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String str = sc.nextLine() + " ";
            int temp = str.charAt(0);
            int count = 1;
            StringBuffer sb = new StringBuffer();
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == temp) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append((char)temp);
                    temp = str.charAt(i);
                    count = 1;
                }

            }
            System.out.println(sb);

        }
    }

    public void test() {

    }
}
