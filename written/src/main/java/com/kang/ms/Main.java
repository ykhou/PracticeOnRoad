package com.kang.ms;

public class Main {
    public static void main(String[] args) {
        int num = 101;
        Main l = new Main();
        l.isLucky(101);
    }

    public String isLucky(int num) {
        if (num % 11 == 0) return "yes";

        int count = 0;
        while (num != 0) {
            int temp = num % 10;
            if (temp == 1) count++;
            num /= 10;
        }

        if (count >= 2) return "yes";

        return "no";
    }
}
