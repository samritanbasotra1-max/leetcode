// Last updated: 09/07/2026, 17:07:25
1class MyCircularDeque {
2
3    int[] deque;
4    int front;
5    int rear;
6    int size;
7    int capacity;
8
9    public MyCircularDeque(int k) {
10        deque = new int[k];
11        capacity = k;
12        front = 0;
13        rear = -1;
14        size = 0;
15    }
16
17    public boolean insertFront(int value) {
18
19        if (isFull())
20            return false;
21
22        front = (front - 1 + capacity) % capacity;
23        deque[front] = value;
24        size++;
25
26        if (size == 1)
27            rear = front;
28
29        return true;
30    }
31
32    public boolean insertLast(int value) {
33
34        if (isFull())
35            return false;
36
37        rear = (rear + 1) % capacity;
38        deque[rear] = value;
39        size++;
40
41        if (size == 1)
42            front = rear;
43
44        return true;
45    }
46
47    public boolean deleteFront() {
48
49        if (isEmpty())
50            return false;
51
52        front = (front + 1) % capacity;
53        size--;
54
55        return true;
56    }
57
58    public boolean deleteLast() {
59
60        if (isEmpty())
61            return false;
62
63        rear = (rear - 1 + capacity) % capacity;
64        size--;
65
66        return true;
67    }
68
69    public int getFront() {
70
71        if (isEmpty())
72            return -1;
73
74        return deque[front];
75    }
76
77    public int getRear() {
78
79        if (isEmpty())
80            return -1;
81
82        return deque[rear];
83    }
84
85    public boolean isEmpty() {
86        return size == 0;
87    }
88
89    public boolean isFull() {
90        return size == capacity;
91    }
92}