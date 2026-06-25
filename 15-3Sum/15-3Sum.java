// Last updated: 25/06/2026, 15:56:54
1
2       
3
4class Solution {
5    public int threeSumClosest(int[] nums, int target) {
6
7        Arrays.sort(nums);
8
9        int closest = nums[0] + nums[1] + nums[2];
10
11        for (int i = 0; i < nums.length - 2; i++) {
12
13            int left = i + 1;
14            int right = nums.length - 1;
15
16            while (left < right) {
17
18                int sum = nums[i] + nums[left] + nums[right];
19
20                if (Math.abs(sum - target) <
21                    Math.abs(closest - target)) {
22                    closest = sum;
23                }
24
25                if (sum < target) {
26                    left++;
27                } else if (sum > target) {
28                    right--;
29                } else {
30                    return sum; 
31                }
32            }
33        }
34
35        return closest;
36    }
37}