package com.kang.tecent0424;

public class Main4 {
    public static void main(String[] args) {

    }

    public ListNode solve (ListNode[] a) {
        // write code here
        for (int i = 0; i < a.length; i++) {
            ListNode temp = a[i];
            while (temp.next != null) {
                if (temp.val == 1) return a[i];
                temp = temp.next;
            }
        }
        return a[0];
    }
}
