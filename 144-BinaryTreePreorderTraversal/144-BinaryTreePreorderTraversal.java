// Last updated: 14/07/2026, 18:02:41
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
18    List<Integer> ans = new ArrayList<>();
19
20    public List<Integer> postorderTraversal(TreeNode root) {
21
22        postorder(root);
23
24        return ans;
25    }
26
27    private void postorder(TreeNode root) {
28
29        if (root == null)
30            return;
31
32        postorder(root.left);
33
34        postorder(root.right);
35
36        ans.add(root.val);
37    }
38}