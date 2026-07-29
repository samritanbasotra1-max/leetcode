// Last updated: 29/07/2026, 22:42:09
1class Solution {
2    public int subarraysDivByK(int[] nums, int k) {
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
15            int rem = ((sum % k) + k) % k;
16
17            if (map.containsKey(rem)) {
18                count += map.get(rem);
19            }
20
21            map.put(rem, map.getOrDefault(rem, 0) + 1);
22        }
23
24        return count;
25    }
26}