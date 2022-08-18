package com.kang.spring.ksyun0414;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        str = str.toLowerCase();
        String[] strArray = str.split(" ");
        System.out.print(strArray[0]);
        for (int i = 1; i < strArray.length; i++) {
            if (!strArray[i].toLowerCase().equals(strArray[i - 1].toLowerCase())) System.out.print(" " + strArray[i]);
        }
    }
}
