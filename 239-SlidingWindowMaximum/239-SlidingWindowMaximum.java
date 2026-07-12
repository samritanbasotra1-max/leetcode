// Last updated: 12/07/2026, 16:00:55
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3        Deque<Integer> dq=new ArrayDeque<>();
4        int n =nums.length;
5        int[] ans=new int[n-k+1];
6        int idx=0;
7        for(int i =0;i<n;i++){
8             while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
9                dq.pollFirst();
10        }
11         while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
12                dq.pollLast();
13    }
14      dq.offerLast(i);
15       if (i >= k - 1) {
16                ans[idx++] = nums[dq.peekFirst()];
17            }
18}
19return ans;
20    }
21}
22
23