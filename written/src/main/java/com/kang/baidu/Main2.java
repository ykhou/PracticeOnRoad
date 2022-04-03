package com.kang.baidu;

import sun.awt.image.ImageWatched;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> input = new LinkedList<>();
        int in = sc.nextInt();
        while (in > 0) {
            input.add(in % 10);
            in /= 10;
        }
        Collections.reverse(input);
        input = new ArrayList<>(input);

        int n = input.size();
        int leftCount0 = 0;
        int leftCount1 = 0;
        for (int i = 0; i < n-1; i++) {
            if (input.get(i) == 1) {
                leftCount1++;
            } else {
                leftCount0++;
            }
        }


        for (int i = 0; i < n; i++) {
            int rightCount0 = leftCount0;
            int rightCount1 = leftCount1;
            for (int j = i + 1; j <= n - (n - 1); j++) {
                if (input.get(j - i - 1) == 0) rightCount0--;
                else rightCount1--;
                if (input.get(n - j) == 0) rightCount0++;
                else rightCount1++;
                if (leftCount0 == rightCount0 && leftCount1 == rightCount1) {
                    System.out.println((i + 1) + " " + (n - j) + " " + (j + 1)+ " " + (n - i));
                    break;
                }
            }
        }
    }
}
