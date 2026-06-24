// Last updated: 24/06/2026, 15:07:21
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int i = 0;
4
5        for(int j = 1; j < nums.length; j++){
6            if(nums[j] != nums[i]){
7                i++;
8                nums[i] = nums[j];
9            }
10        }
11
12        return i + 1;
13    }
14}