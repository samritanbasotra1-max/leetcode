// Last updated: 30/07/2026, 23:43:52
1class Solution {
2    public int minimumPushes(String word) {
3
4        int pushes = 0;
5
6        for (int i = 0; i < word.length(); i++) {
7            pushes += (i / 8) + 1;
8        }
9
10        return pushes;
11    }
12}