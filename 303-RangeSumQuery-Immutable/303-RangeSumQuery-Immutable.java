// Last updated: 28/07/2026, 22:15:32
1class Solution {
2    public int findMaxLength(int[] nums) {
3
4        HashMap<Integer, Integer> map = new HashMap<>();
5
6        map.put(0, -1);
7
8        int sum = 0;
9        int max = 0;
10
11        for (int i = 0; i < nums.length; i++) {
12
13            if (nums[i] == 0)
14                sum--;
15            else
16                sum++;
17
18            if (map.containsKey(sum)) {
19                max = Math.max(max, i - map.get(sum));
20            } else {
21                map.put(sum, i);
22            }
23        }
24
25        return max;
26    }
27}