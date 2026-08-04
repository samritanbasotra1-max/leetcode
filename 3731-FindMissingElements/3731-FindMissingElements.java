// Last updated: 04/08/2026, 18:38:04
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        int min=Integer.MAX_VALUE;
4        int max=Integer.MIN_VALUE;
5        HashSet<Integer> set=new HashSet<>();
6         for (int num : nums) {
7            min = Math.min(min, num);
8            max = Math.max(max, num);
9            set.add(num);
10        }
11           List<Integer> ans = new ArrayList<>();
12
13        for (int i = min + 1; i < max; i++) {
14            if (!set.contains(i)) {
15                ans.add(i);
16            }
17        }
18        return ans;
19    }
20}