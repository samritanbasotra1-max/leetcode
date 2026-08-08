// Last updated: 09/08/2026, 01:21:48
1class Solution {
2    public int[] validSequence(String word1, String word2) {
3
4        int n = word1.length();
5        int m = word2.length();
6
7        int[] ans = new int[m];
8        int[] last = new int[m];
9
10        Arrays.fill(last, -1);
11
12        // Find positions from the right
13        int i = n - 1;
14        int j = m - 1;
15
16        while (i >= 0 && j >= 0) {
17            if (word1.charAt(i) == word2.charAt(j)) {
18                last[j] = i;
19                j--;
20            }
21            i--;
22        }
23
24        boolean usedMismatch = false;
25        j = 0;
26
27        for (i = 0; i < n && j < m; i++) {
28
29            // Exact match
30            if (word1.charAt(i) == word2.charAt(j)) {
31                ans[j] = i;
32                j++;
33            }
34
35            // Use our one allowed mismatch
36            else if (!usedMismatch &&
37                    (j == m - 1 || i < last[j + 1])) {
38
39                ans[j] = i;
40                j++;
41                usedMismatch = true;
42            }
43        }
44
45        // Couldn't form word2
46        if (j < m) {
47            return new int[0];
48        }
49
50        return ans;
51    }
52}