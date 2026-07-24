// Last updated: 24/07/2026, 17:45:01
1class Solution {
2
3    public int[] sortArray(int[] nums) {
4        mergeSort(nums, 0, nums.length - 1);
5        return nums;
6    }
7
8    private void mergeSort(int[] nums, int left, int right) {
9
10        if (left >= right)
11            return;
12
13        int mid = left + (right - left) / 2;
14
15        mergeSort(nums, left, mid);
16        mergeSort(nums, mid + 1, right);
17
18        merge(nums, left, mid, right);
19    }
20
21    private void merge(int[] nums, int left, int mid, int right) {
22
23        int[] temp = new int[right - left + 1];
24
25        int i = left;
26        int j = mid + 1;
27        int k = 0;
28
29        while (i <= mid && j <= right) {
30
31            if (nums[i] <= nums[j]) {
32                temp[k++] = nums[i++];
33            } else {
34                temp[k++] = nums[j++];
35            }
36        }
37
38        while (i <= mid) {
39            temp[k++] = nums[i++];
40        }
41
42        while (j <= right) {
43            temp[k++] = nums[j++];
44        }
45
46        for (int x = 0; x < temp.length; x++) {
47            nums[left + x] = temp[x];
48        }
49    }
50}