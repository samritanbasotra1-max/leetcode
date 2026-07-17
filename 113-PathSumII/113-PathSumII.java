// Last updated: 17/07/2026, 23:45:46
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17
18    List<List<Integer>>result=new ArrayList<>();
19    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
20
21        dfs(root, targetSum, new ArrayList<>());
22
23        return result;
24
25        
26    }
27    private void dfs (TreeNode root, int targetSum, List<Integer> path){
28        if (root == null)
29            return;
30
31        path.add(root.val);
32
33        targetSum -= root.val;
34
35        if (root.left == null && root.right == null && targetSum == 0) {
36            result.add(new ArrayList<>(path));
37        }
38          dfs(root.left, targetSum, path);
39        dfs(root.right, targetSum, path);
40           path.remove(path.size() - 1);
41
42    }
43}