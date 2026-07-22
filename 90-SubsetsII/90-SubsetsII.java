// Last updated: 22/07/2026, 23:23:26
1class Solution {
2
3    public List<List<Integer>> subsetsWithDup(int[] nums) {
4
5        Arrays.sort(nums);
6
7        List<List<Integer>> result = new ArrayList<>();
8        List<Integer> current = new ArrayList<>();
9
10        backtrack(0, nums, current, result);
11
12        return result;
13    }
14
15    private void backtrack(int index,
16                           int[] nums,
17                           List<Integer> current,
18                           List<List<Integer>> result) {
19
20        result.add(new ArrayList<>(current));
21
22        for (int i = index; i < nums.length; i++) {
23
24            
25            if (i > index && nums[i] == nums[i - 1])
26                continue;
27
28            current.add(nums[i]);
29
30            backtrack(i + 1, nums, current, result);
31
32            current.remove(current.size() - 1);
33        }
34    }
35}