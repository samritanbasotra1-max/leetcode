// Last updated: 18/07/2026, 10:55:38
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
17    public boolean isValidBST(TreeNode root) {
18        return validate(root,Long.MIN_VALUE,Long.MAX_VALUE);
19        
20    }
21    private boolean validate(TreeNode root,long min,long max){
22
23        if(root==null)
24            return true;
25         
26          
27          if(root.val<=min || root.val>= max)
28          return false;
29
30     return validate(root.left,min,root.val) && validate(root.right, root.val ,max);
31    }
32}