package com.kang.baidu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
            for (int j = 0; j < K; j++) {
                for (int k = 0; k < N; k++) {
                    for (int l = 0; l < K; l++) {
                        System.out.print(arr[i][k] + " ");
                    }
                }
                System.out.println();
            }
        }

//        int[][] res = new int[N * N][N * K];
//        for (int i = 0; i < N * N; i++) {
//            for (int j = 0; j < N * K; j++) {
//
//            }
//        }
    }
}
