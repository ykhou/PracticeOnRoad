package com.kang.autumn.Microsoft;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        solution("8199");
        System.out.println(ans);
    }

    static StringBuffer sb = new StringBuffer();
    static List<StringBuffer> ans = new ArrayList<>();

    public static String solution(String S) {
        char[] chars = S.toCharArray();
        int[] arr = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            arr[i] = Integer.valueOf(S.substring(i, i+1));
        }

//        dfs(0, arr);
        subsets(arr);
        return "";

    }

    public static void dfs(int cur, int[] nums) {
        if (cur <= nums.length) {
            ans.add(sb);
        }
        if (cur == nums.length) {
            return;
        }
        sb.append(nums[cur]);
        dfs(cur + 1, nums);
        sb.deleteCharAt(sb.length() - 1);
        dfs(cur + 1, nums);
    }

    public static List<StringBuffer> subsets(int[] nums) {
        int n = nums.length;
        for (int mask = 0; mask < (1 << n); ++mask) {
            sb = new StringBuffer();
            for (int i = 0; i < n; ++i) {
                if ((mask & (1 << i)) != 0) {
                    sb.append(nums[i]);
                }
            }
            ans.add(sb);
        }
        return ans;
    }
}
