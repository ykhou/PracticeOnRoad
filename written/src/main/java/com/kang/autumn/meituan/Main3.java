package com.kang.autumn.meituan;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        if (count == 0) {
            System.out.println(0.0);
        }
        int review = sc.nextInt();
        int[] p = new int[count];
        for (int i = 0; i < count; i++) {
            p[i] = sc.nextInt();
        }
        int[] a = new int[count];
        for (int i = 0; i < count; i++) {
            a[i] = sc.nextInt();
        }

        int sum = 0;
        int[] addorce = new int[count];
        for (int i = 0; i < count; i++) {
            sum += 100 * a[i];
            int curAdd = 100 * a[i] - p[i] * a[i];
            addorce[i] = curAdd;
        }

        Arrays.sort(addorce);
        for (int i = 0; i < count - review; i++) {
            sum -= addorce[i];
        }
        double res = sum / 100.0;
        System.out.printf("%.2f", res);
    }
}
