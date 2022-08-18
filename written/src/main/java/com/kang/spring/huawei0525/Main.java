package com.kang.spring.huawei0525;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] map = new int[row][col];
        int[] pos = new int[2];
        String next = sc.nextLine();
        for (int i = 0; i < row; i++) {
            next = sc.nextLine();
            int s = Integer.parseInt(next);
            for (int j = col - 1; j >= 0; j--) {
                map[i][j] = s % 10;
                s = s / 10;
                if (map[i][j] == 2) {
                    pos[0] = j;
                    pos[1] = i;
                }
            }
        }
        int step = sc.nextInt();
        /**
         * 0 北
         * 1 东
         * 2 南
         * 3 西
         * */
        next = sc.nextLine();
        int face = 0;
        for (int i = 0; i <step; i++) {
            int X = 0;
            next = sc.nextLine();
            if (next.equals("L")) face = face - 1 + 4;
            else if (next.equals("R")) face = face + 1;
            else if (next.equals("B")) face = face + 2;
            else {
                face = Math.abs(face) % 4;
                X = Integer.parseInt(next);
                if (face == 0) {
                    for (int j = 0; j < X; j++) {
                        if (pos[1] >0 && pos[1] < row && map[pos[1]+1][pos[0]] != 1) {
                            pos[1]++;
                        } else break;
                    }
                } else if (face == 1) {
                    for (int j = 0; j < X; j++) {
                        if (pos[0] >0 && pos[0] < col && map[pos[1]][pos[0]+1] != 1) {
                            pos[0]++;
                        } else break;
                    }
                } else if (face == 2) {
                    for (int j = 0; j < X; j++) {
                        if (pos[1] >0 && pos[1] < row && map[pos[1]-1][pos[0]] != 1) {
                            pos[1]--;
                        } else break;
                    }
                } else if (face == 3) {
                    for (int j = 0; j < X; j++) {
                        if (pos[0] > 0 && pos[0] < col && map[pos[1]][pos[0]-1] != 1) {
                            pos[0]--;
                        } else break;
                    }
                }
            }
        }
        System.out.println(pos[0]+ " " + pos[1]);
    }
}
