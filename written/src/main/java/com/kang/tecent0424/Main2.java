package com.kang.tecent0424;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        
    }

    public int getNumber (int[] a) {
        // write code here
        int max = a.length;
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            array.add(a[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= max; i++) {
            int continueFlag = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continueFlag = 1;
                    break;
                }
            }
            if (continueFlag == 0) list.add(i);
        }
        while (array.size() != 1) {
            ArrayList<Integer> res = new ArrayList<>();
            for (int i = 0; i < list.size() && list.get(i) <= array.size(); i++) {
                res.add(array.get(list.get(i) - 1));
            }
            array = res;
        }
        return array.get(0);
    }
}
