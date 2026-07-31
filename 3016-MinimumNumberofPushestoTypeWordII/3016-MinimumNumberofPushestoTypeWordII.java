// Last updated: 31/07/2026, 11:24:20
1import java.util.*;
2
3class Solution {
4    public int minimumPushes(String word) {
5
6        int[] freq = new int[26];
7
8        
9        for (char ch : word.toCharArray()) {
10            freq[ch - 'a']++;
11        }
12
13        
14        Arrays.sort(freq);
15
16        int pushes = 0;
17        int position = 0;
18
19        
20        for (int i = 25; i >= 0; i--) {
21
22            if (freq[i] == 0)
23                break;
24
25            pushes += freq[i] * ((position / 8) + 1);
26            position++;
27        }
28
29        return pushes;
30    }
31}