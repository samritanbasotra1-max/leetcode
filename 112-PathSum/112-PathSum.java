// Last updated: 17/07/2026, 23:29:14
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
18    public boolean hasPathSum(TreeNode root, int targetSum) {
19
20        if (root == null) {
21            return false;
22        }
23
24        targetSum -= root.val;
25
26        if (root.left == null && root.right == null) {
27            return targetSum == 0;
28        }
29
30        return hasPathSum(root.left, targetSum)
31                || hasPathSum(root.right, targetSum);
32    }
33}