// Last updated: 26/07/2026, 15:47:43
1class Solution {
2    public int characterReplacement(String s, int k) {
3
4        int[] freq = new int[26];
5
6        int left = 0;
7        int maxFreq = 0;
8        int ans = 0;
9
10        for (int right = 0; right < s.length(); right++) {
11
12            char ch = s.charAt(right);
13            freq[ch - 'A']++;
14
15            maxFreq = Math.max(maxFreq, freq[ch - 'A']);
16
17            while ((right - left + 1) - maxFreq > k) {
18                freq[s.charAt(left) - 'A']--;
19                left++;
20            }
21
22            ans = Math.max(ans, right - left + 1);
23        }
24
25        return ans;
26    }
27}