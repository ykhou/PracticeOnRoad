package com.kang.spring.tecent0424;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.nextLine();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }

        Integer[] arr = new Integer[str[0].length()];
        for (int i = 0; i < str[0].length(); i++) {
            int temp = 0;
            for (int j = 0; j < n; j++) {
                temp = temp * 10 + (str[j].charAt(i) - '0');
            }
            arr[i] = temp;
        }

        Arrays.sort(arr);
        for (Integer i : arr) {
            System.out.print(i + " ");
        }

    }
}
