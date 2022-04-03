package com.kang.wangyi0326;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 获取最少用时
     * @param productList int整型一维数组 物资重量数组
     * @param drivingTimes int整型二维数组 各个岛屿之间的开车时间，不存在道路的为 -1
     * @return int整型
     */
    public int getMinimumTime (int[] productList, int[][] drivingTimes) {
        // write code here
        int sum = 0;
        for (int pro : productList) {
            sum += pro;
        }
        int count = sum / 40 + sum % 40 == 0 ? 0 : 1;


        return 1;
    }
}