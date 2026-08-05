// Last updated: 05/08/2026, 19:19:34
1class Solution {
2    List<Integer>[] graph;
3    boolean[] suspicious;
4
5    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
6        graph = new ArrayList[n];
7        for (int i = 0; i < n; i++) {
8            graph[i] = new ArrayList<>();
9        }
10
11        for (int[] edge : invocations) {
12            graph[edge[0]].add(edge[1]);
13        }
14
15        suspicious = new boolean[n];
16        dfs(k);
17
18        // Check if any outside node calls a suspicious node
19        for (int[] edge : invocations) {
20            int u = edge[0];
21            int v = edge[1];
22            if (!suspicious[u] && suspicious[v]) {
23                List<Integer> ans = new ArrayList<>();
24                for (int i = 0; i < n; i++) ans.add(i);
25                return ans;
26            }
27        }
28
29        List<Integer> ans = new ArrayList<>();
30        for (int i = 0; i < n; i++) {
31            if (!suspicious[i]) {
32                ans.add(i);
33            }
34        }
35
36        return ans;
37    }
38
39    private void dfs(int node) {
40        suspicious[node] = true;
41        for (int nei : graph[node]) {
42            if (!suspicious[nei]) {
43                dfs(nei);
44            }
45        }
46    }
47}
48