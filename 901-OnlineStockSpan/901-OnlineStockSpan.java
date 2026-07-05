// Last updated: 05/07/2026, 23:34:24
1import java.util.Stack;
2
3class StockSpanner {
4
5    
6    private Stack<int[]> stack;
7
8    public StockSpanner() {
9        stack = new Stack<>();
10    }
11
12    public int next(int price) {
13
14        int span = 1;
15
16        while (!stack.isEmpty() && stack.peek()[0] <= price) {
17            span += stack.pop()[1];
18        }
19
20        stack.push(new int[]{price, span});
21
22        return span;
23    }
24}