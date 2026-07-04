// Last updated: 04/07/2026, 14:11:21
1import java.util.Stack;
2
3class Solution {
4    public int[] asteroidCollision(int[] asteroids) {
5
6        Stack<Integer> stack = new Stack<>();
7
8        for (int asteroid : asteroids) {
9
10            boolean destroyed = false;
11
12            
13            while (!stack.isEmpty() &&
14                   stack.peek() > 0 &&
15                   asteroid < 0) {
16
17                if (stack.peek() < -asteroid) {
18                    
19                    stack.pop();
20                }
21                else if (stack.peek() == -asteroid) {
22                    
23                    stack.pop();
24                    destroyed = true;
25                    break;
26                }
27                else {
28                    
29                    destroyed = true;
30                    break;
31                }
32            }
33
34            
35            if (!destroyed) {
36                stack.push(asteroid);
37            }
38        }
39
40        
41        int[] ans = new int[stack.size()];
42
43        for (int i = stack.size() - 1; i >= 0; i--) {
44            ans[i] = stack.pop();
45        }
46
47        return ans;
48    }
49}