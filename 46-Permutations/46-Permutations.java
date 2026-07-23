// Last updated: 23/07/2026, 16:59:26
1class Solution {
2
3    public List<List<Integer>> permute(int[] nums) {
4
5        List<List<Integer>> result = new ArrayList<>();
6        List<Integer> current = new ArrayList<>();
7        boolean[] used = new boolean[nums.length];
8
9        backtrack(nums, used, current, result);
10
11        return result;
12    }
13
14    private void backtrack(int[] nums,
15                           boolean[] used,
16                           List<Integer> current,
17                           List<List<Integer>> result) {
18
19        
20        if (current.size() == nums.length) {
21            result.add(new ArrayList<>(current));
22            return;
23        }
24
25        for (int i = 0; i < nums.length; i++) {
26
27            if (used[i])
28                continue;
29
30            
31            used[i] = true;
32            current.add(nums[i]);
33
34            
35            backtrack(nums, used, current, result);
36
37            
38            current.remove(current.size() - 1);
39            used[i] = false;
40        }
41    }
42}