// Last updated: 29/07/2026, 22:48:58
1class Solution {
2
3    public int numSubarraysWithSum(int[] nums, int goal) {
4        return atMost(nums, goal) - atMost(nums, goal - 1);
5    }
6
7    private int atMost(int[] nums, int goal) {
8
9        if (goal < 0)
10            return 0;
11
12        int left = 0;
13        int sum = 0;
14        int count = 0;
15
16        for (int right = 0; right < nums.length; right++) {
17
18            sum += nums[right];
19
20            while (sum > goal) {
21                sum -= nums[left];
22                left++;
23            }
24
25            count += right - left + 1;
26        }
27
28        return count;
29    }
30}