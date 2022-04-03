package com.kang.wangyi0327;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (x <= 2 * y) {
            if (x >= y) {
                count += min / y + (min % y == 0 ? 0 : 1);
                count += (max - (count * y)) / x + (max % x == 0 ? 0 : 1);
            } else if (x < y) {
                count = max / y + (max % y == 0 ? 0 : 1);
            }
        } else {
            if (max % x == min % x && max % x <= y) {
                count = min / x;
                count += (max - min) / x;
                count++;
            } else if (max % x == min % x && max % x > y) {
                count = min / x;
                count += (max - min) / x;
                count += 2;
            } else if (min % x < y){
                count = min / y + 1;
                count += (max - min) / y + ((max - min) % y == 0 ? 0 : 1);
            } else {
                count = max / x + (max % x == 0 ? 0 : 1);
                count += min / x + (min % x == 0 ? 0 : 1);
            }
        }
        System.out.println(count);
    }
}
