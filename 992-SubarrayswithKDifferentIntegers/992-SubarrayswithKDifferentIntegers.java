// Last updated: 26/07/2026, 17:34:04
1class Solution {
2
3    public int subarraysWithKDistinct(int[] nums, int k) {
4        return atMost(nums, k) - atMost(nums, k - 1);
5    }
6
7    private int atMost(int[] nums, int k) {
8
9        HashMap<Integer, Integer> map = new HashMap<>();
10
11        int left = 0;
12        int count = 0;
13
14        for (int right = 0; right < nums.length; right++) {
15
16            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
17
18            while (map.size() > k) {
19
20                map.put(nums[left], map.get(nums[left]) - 1);
21
22                if (map.get(nums[left]) == 0) {
23                    map.remove(nums[left]);
24                }
25
26                left++;
27            }
28
29            count += right - left + 1;
30        }
31
32        return count;
33    }
34}