// Last updated: 03/07/2026, 00:01:41
1import java.util.*;
2
3class Solution {
4    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
5
6        Stack<Integer> stack = new Stack<>();
7        HashMap<Integer, Integer> map = new HashMap<>();
8
9
10        for (int i = nums2.length - 1; i >= 0; i--) {
11
12            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
13                stack.pop();
14            }
15
16            if (stack.isEmpty()) {
17                map.put(nums2[i], -1);
18            } else {
19                map.put(nums2[i], stack.peek());
20            }
21
22            stack.push(nums2[i]);
23        }
24
25        
26        int[] ans = new int[nums1.length];
27
28        for (int i = 0; i < nums1.length; i++) {
29            ans[i] = map.get(nums1[i]);
30        }
31
32        return ans;
33    }
34}