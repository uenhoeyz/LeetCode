package com.iamzhaoyuan.leetcode.main;

import com.iamzhaoyuan.leetcode.main.AddTwoNumbers.ListNode;

/**
 * 21. Merge Two Sorted Lists
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */
public class MergeTwoLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode start = new ListNode(0);
        ListNode result = start;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                start.val = l1.val;
                l1 = l1.next;
            } else {
                start.val = l2.val;
                l2 = l2.next;
            }
            if (l1 != null || l2 != null) {
                start.next = new ListNode(0);
                start = start.next;
            }
        }
        while (l1 != null) {
            start.val = l1.val;
            l1 = l1.next;
            if (l1 != null) {
                start.next = new ListNode(0);
                start = start.next;
            }
        }
        while (l2 != null) {
            start.val = l2.val;
            l2 = l2.next;
            if (l2 != null) {
                start.next = new ListNode(0);
                start = start.next;
            }
        }
        return result;
    }
}
