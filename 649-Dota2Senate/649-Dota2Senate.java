// Last updated: 12/07/2026, 16:21:18
1import java.util.*;
2
3class Solution {
4    public String predictPartyVictory(String senate) {
5
6        Queue<Integer> radiant = new LinkedList<>();
7        Queue<Integer> dire = new LinkedList<>();
8
9        int n = senate.length();
10
11        // Store indices of senators
12        for (int i = 0; i < n; i++) {
13            if (senate.charAt(i) == 'R')
14                radiant.offer(i);
15            else
16                dire.offer(i);
17        }
18
19        // Simulate voting rounds
20        while (!radiant.isEmpty() && !dire.isEmpty()) {
21
22            int r = radiant.poll();
23            int d = dire.poll();
24
25            if (r < d) {
26                
27                radiant.offer(r + n);
28            } else {
29                
30                dire.offer(d + n);
31            }
32        }
33
34        return radiant.isEmpty() ? "Dire" : "Radiant";
35    }
36}