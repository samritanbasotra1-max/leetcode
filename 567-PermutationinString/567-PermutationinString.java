// Last updated: 27/07/2026, 16:07:56
1class Solution {
2
3    public boolean checkInclusion(String s1, String s2) {
4
5        if (s1.length() > s2.length())
6            return false;
7
8        int[] need = new int[26];
9        int[] window = new int[26];
10
11        for (char c : s1.toCharArray()) {
12            need[c - 'a']++;
13        }
14
15        int left = 0;
16
17        for (int right = 0; right < s2.length(); right++) {
18
19            window[s2.charAt(right) - 'a']++;
20
21            if (right - left + 1 > s1.length()) {
22                window[s2.charAt(left) - 'a']--;
23                left++;
24            }
25
26            if (right - left + 1 == s1.length()) {
27
28                if (Arrays.equals(need, window)) {
29                    return true;
30                }
31            }
32        }
33
34        return false;
35    }
36}