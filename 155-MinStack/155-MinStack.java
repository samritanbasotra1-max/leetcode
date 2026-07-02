// Last updated: 02/07/2026, 23:51:40
1class MinStack {
2    private Stack<Integer> minstack;
3    private Stack<Integer> stack;
4    public MinStack() {
5          stack = new Stack<>();
6        minstack = new Stack<>();
7        
8    }
9    
10    public void push(int val) {
11          stack.push(val);
12
13        if (minstack.isEmpty()) {
14            minstack.push(val);
15        } else {
16            minstack.push(Math.min(val, minstack.peek()));
17        }
18        
19    }
20    
21    public void pop() {
22         stack.pop();
23        minstack.pop();
24        
25
26    }
27    
28    public int top() {
29          return stack.peek();
30        
31    }
32    
33    public int getMin() {
34                return minstack.peek();
35
36        
37    }
38}
39
40/**
41 * Your MinStack object will be instantiated and called as such:
42 * MinStack obj = new MinStack();
43 * obj.push(value);
44 * obj.pop();
45 * int param_3 = obj.top();
46 * int param_4 = obj.getMin();
47 */