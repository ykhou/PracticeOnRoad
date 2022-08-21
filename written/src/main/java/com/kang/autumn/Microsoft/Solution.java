package com.kang.autumn.Microsoft;

import com.sun.xml.internal.org.jvnet.mimepull.CleanUpExecutorFactory;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] X = {2, 4, 2, 6, 7, 1};
        int[] Y = {0, 5, 3, 2, 1, 5};
        int W = 2;
        int solution = solution(X, Y, W);
        System.out.println(solution);
    }
    public static int solution(int[] X, int[] Y, int W) {
        // write your code in Java 8 (Java SE 8)
        Arrays.sort(X);
        int res = 0;
        int left = 0;
        while (left < X.length) {
            int right = X[left] + W;
            while (left < X.length && X[left] <= right) {
                left++;
            }
            res++;
        }
        return res;
    }
}
