// Last updated: 27/06/2026, 23:57:47
1import java.util.HashSet;
2
3class Solution {
4
5    public int lengthOfLongestSubstring(String s) {
6
7        HashSet<Character> set = new HashSet<>();
8
9        int left = 0;
10        int maxLength = 0;
11
12        for (int right = 0; right < s.length(); right++) {
13
14
15            while (set.contains(s.charAt(right))) {
16                set.remove(s.charAt(left));
17                left++;
18            }
19
20            
21            set.add(s.charAt(right));
22
23            
24            maxLength = Math.max(maxLength, right - left + 1);
25        }
26
27        return maxLength;
28    }
29}