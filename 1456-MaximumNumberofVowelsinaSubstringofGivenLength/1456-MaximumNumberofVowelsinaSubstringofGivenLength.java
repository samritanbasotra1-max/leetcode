// Last updated: 26/07/2026, 15:19:53
1class Solution {
2    public int maxVowels(String s, int k) {
3
4        int maxCount = 0;
5        int count = 0;
6
7        
8        for (int i = 0; i < k; i++) {
9            if (isVowel(s.charAt(i))) {
10                count++;
11            }
12        }
13
14        maxCount = count;
15
16        
17        for (int i = k; i < s.length(); i++) {
18
19            
20            if (isVowel(s.charAt(i))) {
21                count++;
22            }
23
24            
25            if (isVowel(s.charAt(i - k))) {
26                count--;
27            }
28
29            maxCount = Math.max(maxCount, count);
30        }
31
32        return maxCount;
33    }
34
35
36    private boolean isVowel(char c) {
37        return c == 'a' || c == 'e' || c == 'i'
38            || c == 'o' || c == 'u';
39    }
40}