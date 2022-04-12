package com.kang.baidu0412;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a = 0; //
            int b = 0;
            for (int j = 0; j < n; j++) {
                if (sc.nextInt() % 2 == 0) b++;
                else a++;
            }
            int count = 0;
            for (int j = 0; j <= k; j += 2) {
                int a1 = jiechen(a);
                int b1 = jiechen(j);
                int a2 = jiechen(b);
                int b2 = jiechen(k - j);
                count += (a1 / b1) * (a2 / b2);
            }
            System.out.println(count);
        }
    }

    private static int jiechen(int m){
        int sum=1;
        for (int i=1;i<=m;i++){
            sum=sum*i;
        }
        return sum;
    }
}
