// Last updated: 23/06/2026, 19:03:17
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int l=0;
4        int r=numbers.length-1;
5       
6        while (l<r){
7             int sum=numbers[l]+numbers[r];
8            if (sum==target){
9                return new int[]{l+1,r+1};
10            }
11            else if(sum>target){
12                r--;
13            }
14            else{
15                l++;
16            }
17        }
18        return new int[]{-1,-1};
19    }
20    
21}