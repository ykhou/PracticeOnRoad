package com.kang.wangyi0415;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // 6
        // 2 5 1 1 1 1
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] jumps = new int[n];
        for (int i = 0; i < n; i++) {
            jumps[i] = sc.nextInt();
        }
        List<Integer> record = new ArrayList<>();
        record.add(0);
        for (int index = 0; index < jumps.length;) {
            int left = index;
            int right = jumps[index] + index;
            record.add(right);
            if (right > n) {
                record.remove(record.size() - 1);
                break;
            }

            int pos = right;
            int max = pos;
            int next = -1;
            while (right - 1 > left) {
                if (right - 1 + jumps[right - 1] > pos) {
                    if (right - 1 + jumps[right - 1] > max) {
                        max = right - 1 + jumps[right - 1];
                        next = right - 1;
                        index = max;
                    }

                    if (max > n) {
                        record.add(right - 1);
                        break;
                    }
                }
                right--;
            }
            if (next != -1) {
                record.add(next);
            }
        }
        System.out.println(record.size());
    }
}
