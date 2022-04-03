package com.kang.baidu;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        String temp = sc.nextLine();
        int[][] road = new int[n+1][n+1];
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            if (u == v) continue;
            if (road[u][v] == 0 ) road[u][v] = w;
            else if (road[u][v] > w) road[u][v] = w;
        }
        for (int i = 0; i < k; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            if (u == v) continue;
            if (road[u][v] == 0) road[u][v] = w;
            else if (road[u][v] < w) road[u][v] = w;
            if (road[v][v] == 0) road[v][u] = w;
            else if (road[v][u] < w) road[v][u] = w;
        }

        temp = sc.nextLine();
        // 当面取件
        int a = sc.nextInt();
        // 存件
        int b = sc.nextInt();
        // 待配送快递
        int q = sc.nextInt();
        int[] need = new int[q];
        for (int i = 0; i < q; i++) {
            need[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < q; i++) {
            if (i == 0 && need[i] != s) {
                count += road[s][need[i]];
            } else if (i != 0) {
                count += road[need[i-1]][need[i]];
            }
            if (count % 2 == 1) count += a;
            else count += b;
        }
        if (need[q-1] != s) count += road[need[q-1]][s];
        System.out.println(count);
    }
}
