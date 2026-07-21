// Last updated: 21/07/2026, 16:57:15
1
2class Solution {
3
4    public List<List<Integer>> subsets(int[] nums) {
5
6        List<List<Integer>> result = new ArrayList<>();
7        List<Integer> current = new ArrayList<>();
8
9        backtrack(0, nums, current, result);
10
11        return result;
12    }
13
14    private void backtrack(int index, int[] nums,
15                           List<Integer> current,
16                           List<List<Integer>> result) {
17
18        
19        result.add(new ArrayList<>(current));
20
21        for (int i = index; i < nums.length; i++) {
22
23            
24            current.add(nums[i]);
25
26            
27            backtrack(i + 1, nums, current, result);
28
29            
30            current.remove(current.size() - 1);
31        }
32    }
33}