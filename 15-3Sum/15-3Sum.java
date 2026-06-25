// Last updated: 25/06/2026, 15:49:21
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> result=new ArrayList<>();
4        Arrays.sort(nums);
5        for(int i=0;i<nums.length-2;i++){
6            if(i>0 && nums[i]==nums[i-1]){
7                continue;
8            }
9            int left=i+1;
10            int right=nums.length-1;
11            while(left<right){
12         int sum=nums[i]+nums[left]+nums[right];
13         if (sum == 0) {
14
15                    result.add(Arrays.asList(
16                            nums[i],
17                            nums[left],
18                            nums[right]
19                    ));
20
21                    left++;
22                    right--;
23                  while (left < right &&
24                     nums[left] == nums[left - 1]) {
25                       left++;
26                    }
27                    while (left < right &&
28                           nums[right] == nums[right + 1]) {
29                        right--;
30                    }
31
32                 
33            }else if (sum<0){
34                left++;
35            }else{
36                right--;
37            }
38
39        }
40        
41    }
42    return result;
43}
44}