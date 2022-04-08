package com.kang.Leetcode;

public class swapNodesInPairs {
    private static ListNode swap(ListNode head) {
        // a b c d e
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy;
        while (pre.next.next != null && pre.next != null) {
            // pre a b c
            ListNode nextFirst = head.next.next; // c
            ListNode temp = pre.next; // a
            pre.next = head.next; // pre -> b
            head.next.next = head; // pre -> b -> a
            head.next = nextFirst; // pre -> b -> a -> c
            pre = head; // a
            head = pre.next; // c
        }
        return dummy.next;
    }


    public static class ListNode {
        char val;
        ListNode next;

        ListNode() {}

        ListNode(char val) {
            this.val = val;
        }
    }
}
