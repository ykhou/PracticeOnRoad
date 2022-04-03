package com.kang.xinyang;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int head = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        list.add(head);
        int[] to = new int[n];
        int[] from = new int[n];
        for (int i = 0; i < n; i++) {
            to[i] = sc.nextInt();
            from[i] = sc.nextInt();
        }
        for (int i = n-1; i >= 0; i++) {

        }
    }
}
