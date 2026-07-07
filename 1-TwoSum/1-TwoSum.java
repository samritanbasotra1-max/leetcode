// Last updated: 07/07/2026, 23:43:51
1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5    public int[] twoSum(int[] nums, int target) {
6        
7        Map<Integer, Integer> map = new HashMap<>();
8        
9        for (int i = 0; i < nums.length; i++) {
10            int complement=target -nums[i];
11            if(map.containsKey(complement)){
12                return new int[]{map.get(complement) ,i};
13                }
14                map.put(nums[i],i);
15
16            }
17            return new int[]{-1,-1};
18        }
19    }
20
21            
22 