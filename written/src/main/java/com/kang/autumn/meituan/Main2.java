package com.kang.autumn.meituan;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        int[][] pos = new int[2][count];
        for (int i = 0; i < count; i++) {
            pos[0][i] = sc.nextInt();
            pos[1][i] = sc.nextInt();
        }
        int[] distance = new int[count];
        for (int i = 0; i < count; i++) {
            distance[i] = sc.nextInt();
        }

        boolean flag = false;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                for (int k = 0; k < count; k++) {
                    int manhadun = Manhadun(i, j, pos[0][k], pos[1][k]);
                    if (manhadun != distance[k]) {
                        continue;
                    } else if (k == count - 1) {
                        System.out.print(i + " " + j);
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (flag) {
                break;
            }
        }

    }

    public static int Manhadun(int a, int b, int x, int y) {
        return (Math.abs(x - a) + Math.abs(y - b));
    }
}
