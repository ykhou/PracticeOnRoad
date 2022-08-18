package com.kang.autumn.dajiang;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.*;

class Solution2 {

    /* Write Code Here */
    public int minimumDeviation(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != 2 && nums[i] % 2 == 0) {
                nums[i] = nums[i] / 2;
            }
            while (nums[i] % 2 == 1) {
                nums[i] *= 2;
            }
        }
        return 0;
    }
}

public class Main2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int nums_size = 0;
        nums_size = in.nextInt();
        int[] nums = new int[nums_size];
        for(int nums_i = 0; nums_i < nums_size; nums_i++) {
            nums[nums_i] = in.nextInt();
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }

        res = new Solution2().minimumDeviation(nums);
        System.out.println(String.valueOf(res));
    }
}

