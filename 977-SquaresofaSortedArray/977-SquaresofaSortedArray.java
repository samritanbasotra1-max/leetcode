// Last updated: 24/06/2026, 15:35:24
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3
4        int i = 0;
5        int j = 0;
6        int k = 0;
7
8        int[] res = new int[m + n];
9
10        while (i < m && j < n) {
11            if (nums1[i] <= nums2[j]) {
12                res[k++] = nums1[i++];
13            } else {
14                res[k++] = nums2[j++];
15            }
16        }
17
18        while (i < m) {
19            res[k++] = nums1[i++];
20        }
21
22        while (j < n) {
23            res[k++] = nums2[j++];
24        }
25
26        for (int x = 0; x < m + n; x++) {
27            nums1[x] = res[x];
28        }
29    }
30}