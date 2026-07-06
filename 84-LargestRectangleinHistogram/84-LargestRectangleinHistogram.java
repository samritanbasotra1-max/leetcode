// Last updated: 06/07/2026, 14:33:37
1import java.util.Stack;
2
3class Solution {
4
5    public int largestRectangleArea(int[] heights) {
6
7        int n = heights.length;
8
9        int[] left = new int[n];
10        int[] right = new int[n];
11
12        Stack<Integer> stack = new Stack<>();
13
14        
15        for (int i = 0; i < n; i++) {
16
17            while (!stack.isEmpty() &&
18                    heights[stack.peek()] >= heights[i]) {
19                stack.pop();
20            }
21
22            if (stack.isEmpty())
23                left[i] = -1;
24            else
25                left[i] = stack.peek();
26
27            stack.push(i);
28        }
29
30        stack.clear();
31
32        
33        for (int i = n - 1; i >= 0; i--) {
34
35            while (!stack.isEmpty() &&
36                    heights[stack.peek()] >= heights[i]) {
37                stack.pop();
38            }
39
40            if (stack.isEmpty())
41                right[i] = n;
42            else
43                right[i] = stack.peek();
44
45            stack.push(i);
46        }
47
48        int maxArea = 0;
49
50        for (int i = 0; i < n; i++) {
51
52            int width = right[i] - left[i] - 1;
53
54            int area = heights[i] * width;
55
56            maxArea = Math.max(maxArea, area);
57        }
58
59        return maxArea;
60    }
61}