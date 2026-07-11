// Last updated: 11/07/2026, 22:32:12
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        if (strs == null || strs.length == 0) return "";
4
5        for (int i = 0; i < strs[0].length(); i++) {
6            char c = strs[0].charAt(i);
7
8            for (int j = 1; j < strs.length; j++) {
9                if (i == strs[j].length() || strs[j].charAt(i) != c) {
10                    return strs[0].substring(0, i);
11                }
12            }
13        }
14
15        return strs[0];
16    }
17}