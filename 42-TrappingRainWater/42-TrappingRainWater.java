// Last updated: 06/07/2026, 14:45:36
1class Solution {
2
3    public int trap(int[] height) {
4
5        int left = 0;
6        int right = height.length - 1;
7
8        int leftMax = 0;
9        int rightMax = 0;
10
11        int water = 0;
12
13        while (left < right) {
14
15            if (height[left] < height[right]) {
16
17                if (height[left] >= leftMax) {
18                    leftMax = height[left];
19                } else {
20                    water += leftMax - height[left];
21                }
22
23                left++;
24            }
25
26            else {
27
28                if (height[right] >= rightMax) {
29                    rightMax = height[right];
30                } else {
31                    water += rightMax - height[right];
32                }
33
34                right--;
35            }
36        }
37
38        return water;
39    }
40}