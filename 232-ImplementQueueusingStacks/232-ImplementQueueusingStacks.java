// Last updated: 08/07/2026, 14:49:35
1import java.util.Stack;
2
3class MyQueue {
4
5    Stack<Integer> input;
6    Stack<Integer> output;
7
8    public MyQueue() {
9        input = new Stack<>();
10        output = new Stack<>();
11    }
12
13    public void push(int x) {
14        input.push(x);
15    }
16
17    public int pop() {
18        move();
19        return output.pop();
20    }
21
22    public int peek() {
23        move();
24        return output.peek();
25    }
26
27    public boolean empty() {
28        return input.isEmpty() && output.isEmpty();
29    }
30
31    private void move() {
32        if (output.isEmpty()) {
33            while (!input.isEmpty()) {
34                output.push(input.pop());
35            }
36        }
37    }
38}