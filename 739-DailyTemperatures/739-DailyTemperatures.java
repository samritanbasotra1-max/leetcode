// Last updated: 04/07/2026, 13:40:06
1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3        
4        int n =temperatures.length;
5        int ans[]=new int[n];
6         Stack<Integer> stack = new Stack<>();
7         for (int i = n - 1; i >= 0; i--) {
8
9            while(!stack.isEmpty()&& temperatures[stack.peek()] <= temperatures[i]){
10                stack.pop();
11
12            }
13            if (stack.isEmpty()) {
14                ans[i] = 0;
15            } else {
16                ans[i] = stack.peek() - i;
17            }
18            stack.push(i);
19         }
20         return ans;
21
22         }
23
24    }
25