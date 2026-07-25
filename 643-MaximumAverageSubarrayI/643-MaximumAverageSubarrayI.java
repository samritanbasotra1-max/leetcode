// Last updated: 25/07/2026, 22:03:39
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int  windowsum = 0;
4        for(int i=0;i<k;i++){
5            windowsum+=nums[i];
6
7
8        }
9        int maxsum=windowsum;
10        for(int i=k;i<nums.length;i++){
11            windowsum += nums[i];       
12            windowsum -= nums[i - k];   
13
14            maxsum = Math.max(maxsum, windowsum);
15
16
17        }
18
19
20       
21        
22
23        return (double) maxsum / k;
24    }
25}