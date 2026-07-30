// Last updated: 30/07/2026, 23:40:39
1class Solution {
2    public int maxProduct(int[] nums) {
3
4        int maxProduct = nums[0];
5        int minProduct = nums[0];
6        int ans = nums[0];
7
8        for (int i = 1; i < nums.length; i++) {
9
10            int current = nums[i];
11
12            int tempMax = Math.max(current,
13                    Math.max(maxProduct * current, minProduct * current));
14
15            int tempMin = Math.min(current,
16                    Math.min(maxProduct * current, minProduct * current));
17
18            maxProduct = tempMax;
19            minProduct = tempMin;
20
21            ans = Math.max(ans, maxProduct);
22        }
23
24        return ans;
25    }
26}