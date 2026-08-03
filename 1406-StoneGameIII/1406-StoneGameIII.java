// Last updated: 03/08/2026, 23:24:56
1class Solution {
2
3    public String stoneGameIII(int[] stoneValue) {
4
5        int n = stoneValue.length;
6
7        int[] dp = new int[n + 1];
8
9        for (int i = n - 1; i >= 0; i--) {
10
11            dp[i] = Integer.MIN_VALUE;
12
13            int sum = 0;
14
15            for (int k = 0; k < 3 && i + k < n; k++) {
16
17                sum += stoneValue[i + k];
18
19                dp[i] = Math.max(dp[i],
20                        sum - dp[i + k + 1]);
21            }
22        }
23
24        if (dp[0] > 0)
25            return "Alice";
26
27        if (dp[0] < 0)
28            return "Bob";
29
30        return "Tie";
31    }
32}