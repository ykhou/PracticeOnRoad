package com.kang.autumn.kedaxunfei;

import java.util.*;


public class Solution2 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 验证指令的正确性
     * @param signal string字符串 待验证的指令
     * @return bool布尔型
     */
    public boolean signalVerify (String signal) {
        // write code here
        char[] sig = signal.toCharArray();

        int index = 0;
        if (sig[index] >= 'a' && sig[index] <= 'z') {
            index++;
        }
        if (sig[index] == '=') {
            index++;
        } else {
            return false;
        }
        if (sig[index] == ' ') {
            return false;
        } else if ((sig[index] >= 'a' && sig[index] <= 'z') || (sig[index] >= '0' && sig[index] <= '9') ) {
            index++;
        } else {
            return false;
        }
        for (; index < sig.length; ) {
            if ((sig[index] >= 'a' && sig[index] <= 'z') || (sig[index] >= '0' && sig[index] <= '9') || sig[index] == ' ' ) {
                index++;
            } else {
                return false;
            }
        }
        return true;
    }


}
