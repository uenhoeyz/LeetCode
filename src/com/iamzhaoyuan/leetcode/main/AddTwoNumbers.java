package com.iamzhaoyuan.leetcode.main;

/**
 * 2. Add Two Numbers
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }
        ListNode start = new ListNode(0);
        ListNode tmpNode = start;
        int carry = 0;
        while (l1 != null || l2 != null || carry == 1) {
            int v1 = 0;
            if (l1 != null) {
                v1 = l1.val;
                l1 = l1.next;
            }
            int v2 = 0;
            if (l2 != null) {
                v2 = l2.val;
                l2 = l2.next;
            }
            int value = (v1 + v2 + carry) % 10;
            tmpNode.val = value;
            carry = (v1 + v2 + carry) / 10;
            if (l1 != null || l2 != null || carry == 1) {
                tmpNode.next = new ListNode(0);
                tmpNode = tmpNode.next;
            }
        }
        return start;
    }

    public final static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
