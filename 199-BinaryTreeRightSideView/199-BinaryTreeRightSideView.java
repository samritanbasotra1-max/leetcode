// Last updated: 19/07/2026, 13:00:51
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
17    public List<Integer> rightSideView(TreeNode root) {
18
19        List<Integer> ans= new ArrayList<>();
20        if(root==null)
21        return ans;
22
23        Queue<TreeNode> queue=new LinkedList<>();
24        queue.offer(root);
25         while(!queue.isEmpty()){
26            int size=queue.size();
27
28            for(int i=0; i<size; i++){
29
30                TreeNode current =queue.poll();
31
32                  if (i == size - 1) {
33                    ans.add(current.val);
34                }
35
36                if (current.left != null)
37                    queue.offer(current.left);
38
39                if (current.right != null)
40                    queue.offer(current.right);
41            }
42         }
43        return ans;
44    }
45}