package com.kang.autumn.dajiang;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    /* Write Code Here */
    public int findMinDifference(String[] timePoints) {
        int min = Integer.MAX_VALUE;
        int hour24 = 60 * 24;
        for (int i = 0; i < timePoints.length; i++) {
            for (int j = i + 1; j < timePoints.length; j++) {
                String[] time1 = timePoints[i].split(":");
                String[] time2 = timePoints[j].split(":");
                int min1 = Integer.valueOf(time1[0]) * 60 + Integer.valueOf(time1[1]);
                int min2 = Integer.valueOf(time2[0]) * 60 + Integer.valueOf(time2[1]);
                min = Math.min(min, Math.min(Math.abs(min1 - min2), hour24 - Math.abs(min1 - min2)));
            }
        }
        return min;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int timePoints_size = 0;
        timePoints_size = in.nextInt();
        if (in.hasNextLine())
            in.nextLine();
        String[] timePoints = new String[timePoints_size];
        String timePoints_item;
        for(int timePoints_i = 0; timePoints_i < timePoints_size; timePoints_i++) {
            try {
                timePoints_item = in.nextLine();
            } catch (Exception e) {
                timePoints_item = null;
            }
            timePoints[timePoints_i] = timePoints_item;
        }

        res = new Solution().findMinDifference(timePoints);
        System.out.println(String.valueOf(res));

    }
}
