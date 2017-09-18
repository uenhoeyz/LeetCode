package com.iamzhaoyuan.leetcode.main;

/**
 * 14. Longest Common Prefix
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int tmp = -1;
        int len = strs.length;
        int base = strs[0].length();
        boolean flag = true;
        for (int a = 0; a < base; a++) {
            char curr = strs[0].charAt(a);
            for (int i = 1; i < len; i++) {
                if (strs[i].length() < a + 1 || strs[i].charAt(a) != curr) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                break;
            }
            tmp = a;
        }
        if (tmp == -1) {
            return "";
        }
        return strs[0].substring(0, tmp + 1);
    }
}
