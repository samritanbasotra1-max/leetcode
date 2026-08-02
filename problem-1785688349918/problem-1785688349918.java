// Last updated: 02/08/2026, 22:02:29
1class Solution {
2
3    Integer[][] memo;
4
5    public boolean stoneGame(int[] piles) {
6
7        int n = piles.length;
8        memo = new Integer[n][n];
9
10        return solve(piles, 0, n - 1) > 0;
11    }
12
13    private int solve(int[] piles, int left, int right) {
14
15        if (left == right)
16            return piles[left];
17
18        if (memo[left][right] != null)
19            return memo[left][right];
20
21        int pickLeft =
22                piles[left] - solve(piles, left + 1, right);
23
24        int pickRight =
25                piles[right] - solve(piles, left, right - 1);
26
27        return memo[left][right] =
28                Math.max(pickLeft, pickRight);
29    }
30}