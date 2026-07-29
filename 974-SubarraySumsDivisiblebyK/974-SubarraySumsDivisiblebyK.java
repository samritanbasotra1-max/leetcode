// Last updated: 29/07/2026, 22:46:04
1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3
4        HashMap<Integer, Integer> map = new HashMap<>();
5
6        map.put(0, 1);
7
8        int sum = 0;
9        int count = 0;
10
11        for (int num : nums) {
12
13            sum += num;
14
15            if (map.containsKey(sum - goal)) {
16                count += map.get(sum - goal);
17            }
18
19            map.put(sum, map.getOrDefault(sum, 0) + 1);
20        }
21
22        return count;
23    }
24}