// Last updated: 04/07/2026, 13:54:23
1import java.util.Stack;
2
3class Solution {
4    public int[] nextGreaterElements(int[] nums) {
5
6        int n = nums.length;
7        int[] ans = new int[n];
8
9        Stack<Integer> stack = new Stack<>();
10
11        for (int i = 2 * n - 1; i >= 0; i--) {
12
13            int index = i % n;
14
15            while (!stack.isEmpty() &&
16                   stack.peek() <= nums[index]) {
17                stack.pop();
18            }
19
20            if (i < n) {
21                if (stack.isEmpty()) {
22                    ans[index] = -1;
23                } else {
24                    ans[index] = stack.peek();
25                }
26            }
27
28            stack.push(nums[index]);
29        }
30
31        return ans;
32    }
33}