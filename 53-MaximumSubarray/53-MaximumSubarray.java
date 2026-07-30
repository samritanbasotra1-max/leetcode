// Last updated: 30/07/2026, 23:31:41
1class Solution {
2
3    public int maxSubarraySumCircular(int[] nums) {
4
5        int totalSum = 0;
6
7        int currentMax = nums[0];
8        int maxSum = nums[0];
9
10        int currentMin = nums[0];
11        int minSum = nums[0];
12
13        totalSum = nums[0];
14
15        for (int i = 1; i < nums.length; i++) {
16
17            totalSum += nums[i];
18
19            currentMax = Math.max(nums[i], currentMax + nums[i]);
20            maxSum = Math.max(maxSum, currentMax);
21
22            currentMin = Math.min(nums[i], currentMin + nums[i]);
23            minSum = Math.min(minSum, currentMin);
24        }
25
26        
27        if (maxSum < 0)
28            return maxSum;
29
30        return Math.max(maxSum, totalSum - minSum);
31    }
32}