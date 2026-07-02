// Last updated: 02/07/2026, 23:22:42
1import java.util.LinkedList;
2import java.util.Queue;
3
4class MyStack {
5
6    Queue<Integer> q1 = new LinkedList<>();
7    Queue<Integer> q2 = new LinkedList<>();
8
9    public void push(int x) {
10        q2.offer(x);
11
12        while (!q1.isEmpty()) {
13            q2.offer(q1.poll());
14        }
15
16        Queue<Integer> temp = q1;
17        q1 = q2;
18        q2 = temp;
19    }
20
21    public int pop() {
22        return q1.poll();
23    }
24
25    public int top() {
26        return q1.peek();
27    }
28
29    public boolean empty() {
30        return q1.isEmpty();
31    }
32}