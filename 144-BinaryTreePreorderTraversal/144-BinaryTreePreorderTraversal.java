// Last updated: 14/07/2026, 17:58:40
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
16
17class Solution {
18
19    List<Integer> ans = new ArrayList<>();
20
21    public List<Integer> preorderTraversal(TreeNode root) {
22
23        preorder(root);
24
25        return ans;
26    }
27
28    private void preorder(TreeNode root) {
29
30        if (root == null)
31            return;
32
33        ans.add(root.val);
34
35        preorder(root.left);
36
37        preorder(root.right);
38    }
39}