package com.kang.spring.ali;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer[]> x1 = new HashSet<>();
        Map<Integer[], Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                Integer[] temp = new Integer[2];
                temp[0] = sc.nextInt();
                temp[1] = sc.nextInt();
                int t = sc.nextInt();
                if (x1.contains(temp)) {
                    Integer a = map.get(temp);
                    map.put(temp, a + 1);
                }
                else {


                }
            }

        }
        System.out.println(n * (n-1)/2);
    }
}
