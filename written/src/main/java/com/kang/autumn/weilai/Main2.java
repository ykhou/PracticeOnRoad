package com.kang.autumn.weilai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] num = new int[count];
        int[] father = new int[count];
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < count; i++) {
            father[i] = sc.nextInt();
        }
        for (int i = count - 1; i > 0; i--) {
            if (num[i] > 0) {
                num[father[i] - 1] = num[father[i] - 1] + num[i];
            }
        }

        int max = num[0];
        for (int i = 0; i < count; i++) {
            max = Math.max(num[i], max);
        }
        System.out.println(max);
    }
}
