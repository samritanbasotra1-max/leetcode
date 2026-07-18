// Last updated: 18/07/2026, 11:13:16
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13
14        if(p.val<root.val&&q.val<root.val)
15        return lowestCommonAncestor(root.left,p,q);
16
17        if(p.val>root.val&&q.val>root.val)
18        return lowestCommonAncestor(root.right,p,q);
19
20        return root;
21        
22        
23    }
24}