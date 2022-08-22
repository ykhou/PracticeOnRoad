package com.kang.autumn.xinghuan;

import javafx.scene.transform.Scale;

import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            Random random = new Random();
            int i1 = random.nextInt(2);
            if (i1 == 1) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        }
    }
}
