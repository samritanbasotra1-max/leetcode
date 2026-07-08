// Last updated: 08/07/2026, 15:01:58
1import java.util.LinkedList;
2import java.util.Queue;
3
4class RecentCounter {
5
6    Queue<Integer> queue;
7
8    public RecentCounter() {
9        queue = new LinkedList<>();
10    }
11
12    public int ping(int t) {
13
14        queue.offer(t);
15
16        while (queue.peek() < t - 3000) {
17            queue.poll();
18        }
19
20        return queue.size();
21    }
22}