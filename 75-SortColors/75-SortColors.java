// Last updated: 25/06/2026, 16:27:18
1class Solution {
2
3    public void sortColors(int[] nums) {
4
5        int low = 0;
6        int mid = 0;
7        int high = nums.length - 1;
8
9        while (mid <= high) {
10
11            if (nums[mid] == 0) {
12
13                swap(nums, low, mid);
14                low++;
15                mid++;
16
17            } 
18            else if (nums[mid] == 1) {
19
20                mid++;
21
22            } 
23            else {
24
25                swap(nums, mid, high);
26                high--;
27            }
28        }
29    }
30
31    void swap(int[] nums, int i, int j) {
32
33        int temp = nums[i];
34        nums[i] = nums[j];
35        nums[j] = temp;
36    }
37}