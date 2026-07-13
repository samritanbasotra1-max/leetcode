// Last updated: 13/07/2026, 15:55:47
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
18    public boolean isSameTree(TreeNode p, TreeNode q) {
19
20        if (p == null && q == null) {
21            return true;
22        }
23
24        if (p == null || q == null) {
25            return false;
26        }
27
28        if (p.val != q.val) {
29            return false;
30        }
31
32        return isSameTree(p.left, q.left)
33                && isSameTree(p.right, q.right);
34    }
35}