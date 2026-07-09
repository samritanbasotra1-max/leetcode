// Last updated: 09/07/2026, 16:42:37
1class MyCircularQueue {
2
3
4        int[] queue;
5        int front;
6        int rear;
7        int size;
8        int capacity;
9    public MyCircularQueue(int k) {
10        queue =new int[k];
11        capacity = k;
12        front = 0;
13        rear = -1;
14        size = 0;
15        
16    }
17    
18    public boolean enQueue(int value) {
19        
20
21        if (isFull())
22            return false;
23
24        rear = (rear + 1) % capacity;
25        queue[rear] = value;
26        size++;
27
28        return true;
29    }
30    
31    public boolean deQueue() {
32        if (isEmpty())
33            return false;
34
35        front = (front + 1) % capacity;
36        size--;
37
38        return true;
39        
40    }
41    
42    public int Front() {
43         if (isEmpty())
44            return -1;
45
46        return queue[front];
47        
48    }
49    
50    public int Rear() {
51        if(isEmpty())
52        return -1;
53
54        return queue[rear];
55        
56    }
57    
58    public boolean isEmpty() {
59        
60        return size == 0;
61    }
62    
63    public boolean isFull() {
64        return size == capacity;
65    }
66}
67
68/**
69 * Your MyCircularQueue object will be instantiated and called as such:
70 * MyCircularQueue obj = new MyCircularQueue(k);
71 * boolean param_1 = obj.enQueue(value);
72 * boolean param_2 = obj.deQueue();
73 * int param_3 = obj.Front();
74 * int param_4 = obj.Rear();
75 * boolean param_5 = obj.isEmpty();
76 * boolean param_6 = obj.isFull();
77 */