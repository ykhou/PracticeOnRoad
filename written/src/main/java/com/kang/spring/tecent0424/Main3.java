package com.kang.spring.tecent0424;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int[] res = new int[count];
        int[] de = new int[count];
        for (int i = 0; i < count; i++) {
            res[i] = i + 1;
            de[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        int left = 0;
        int right = count - 1;
        int result = -1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            int jingong = 0;
            int temp = 0;
            while (temp < mid) {
                if (de[temp] == 0) {
                    jingong += res[temp];
                }
                temp++;
            }
            // 右侧防守
            temp = count - 1;
            int fangshou = 0;
            while (temp >= mid) {
                if (de[temp] == 1) {
                    fangshou += res[temp];
                }
                temp--;
            }

            if (result == -1) {
                result = Math.abs(jingong - fangshou);
            } else {
                result = Math.min(result, Math.abs(jingong - fangshou));
            }
            if (jingong > fangshou) right = mid - 1;
            else if (jingong < fangshou) left = mid + 1;
            else break;
        }
        System.out.println(result);
    }
}

//        int result = -1;
//        for (int j = 0; j < count; j++) {
//            int left = 0;
//            int right = count - 1;
//
//            // 左侧进攻
//            int jingong = 0;
//            while (left != j) {
//                if (de[left] == 0) {
//                    jingong += res[left];
//                }
//                left++;
//            }
//
//            // 右侧防守
//            int fangshou = 0;
//            while (right != j) {
//                if (de[right] == 1) {
//                    fangshou += res[right];
//                }
//                right--;
//            }
//            if (result == -1) {
//                result = Math.abs(jingong - fangshou);
//            } else {
//                result = Math.min(result, Math.abs(jingong - fangshou));
//            }
//        }