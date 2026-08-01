// Last updated: 01/08/2026, 09:08:36
1class Solution {
2
3    Integer[][] memo;
4
5    public boolean predictTheWinner(int[] nums) {
6
7        int n = nums.length;
8        memo = new Integer[n][n];
9
10        return solve(nums, 0, n - 1) >= 0;
11    }
12
13    private int solve(int[] nums, int left, int right) {
14
15        if (left == right)
16            return nums[left];
17
18        if (memo[left][right] != null)
19            return memo[left][right];
20
21        int pickLeft = nums[left] - solve(nums, left + 1, right);
22        int pickRight = nums[right] - solve(nums, left, right - 1);
23
24        return memo[left][right] = Math.max(pickLeft, pickRight);
25    }
26}