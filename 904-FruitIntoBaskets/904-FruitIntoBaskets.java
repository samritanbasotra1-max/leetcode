// Last updated: 26/07/2026, 17:23:48
1class Solution {
2    public int totalFruit(int[] fruits) {
3
4        HashMap<Integer,Integer> map=new HashMap<>();
5        int left=0;
6        int ans=0;
7
8        for(int right=0; right< fruits.length;right++){
9
10            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
11             while (map.size() > 2) {
12
13                map.put(fruits[left], map.get(fruits[left]) - 1);
14
15                if (map.get(fruits[left]) == 0) {
16                    map.remove(fruits[left]);
17                }
18
19                left++;
20            }
21          ans = Math.max(ans, right - left + 1);
22
23        }
24
25        return ans;
26    }
27}