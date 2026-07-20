// Last updated: 20/07/2026, 21:30:52
1class Solution {
2
3    public int search(int[] nums, int target) {
4        return binarySearch(nums, 0, nums.length - 1, target);
5    }
6
7    private int binarySearch(int[] nums, int low, int high, int target) {
8
9        if (low > high)
10            return -1;
11
12        int mid = low + (high - low) / 2;
13
14        if (nums[mid] == target)
15            return mid;
16
17        if (target < nums[mid]) {
18            return binarySearch(nums, low, mid - 1, target);
19        }
20
21        return binarySearch(nums, mid + 1, high, target);
22    }
23}