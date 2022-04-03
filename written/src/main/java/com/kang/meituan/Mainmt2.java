package com.kang.meituan;

import com.kang.ms.Main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Mainmt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int x = 0;
        while (n > 0) {
            nums[x++] = sc.nextInt();
            n--;
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int j = i + 1; j < nums.length; j++) {
                if (Mainmt2.muti(temp) > 0) count++;
            }
        }
        System.out.println(count);
    }

    public static int muti(ArrayList<Integer> temp) {
        int mu = 1;
        for (int i = 0; i < temp.size(); i++) {
            mu *= temp.get(i);
        }
        return mu;
    }

}
