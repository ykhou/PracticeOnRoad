package com.kang.autumn.MicroSoft0820;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {

    }

    public int solution(int K, int[][] house) {
        int count = 0;
        for (int i = 0; i < house.length; i++) {
            for (int j = 0; j < house[0].length; j++) {
                if (house[i][j] == 1) {

                }
            }
        }

        for (int i = 0; i < house.length; i++) {
            for (int j = 0; j < house[0].length; j++) {
                if (house[i][j] != 1) {

                }
            }
        }
        return 1;
    }

    public Boolean isInK(int K, int x, int y, int a, int b) {
        return Math.abs(x - a) + Math.abs(y - b) <= K;
    }
}
