// Last updated: 15/07/2026, 23:47:43
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
18    int diameter = 0;
19
20    public int diameterOfBinaryTree(TreeNode root) {
21
22        height(root);
23
24        return diameter;
25    }
26
27    private int height(TreeNode root) {
28
29        if (root == null)
30            return 0;
31
32        int left = height(root.left);
33
34        int right = height(root.right);
35
36        diameter = Math.max(diameter, left + right);
37
38        return 1 + Math.max(left, right);
39    }
40}