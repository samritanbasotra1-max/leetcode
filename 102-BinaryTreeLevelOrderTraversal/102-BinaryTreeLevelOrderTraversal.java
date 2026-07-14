// Last updated: 14/07/2026, 17:40:57
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18
19        List<List<Integer>> result=new ArrayList<>();
20
21        if(root==null){
22            return result;
23
24        }
25
26        Queue<TreeNode> queue=new LinkedList<>();
27        queue.offer(root);
28
29        while(!queue.isEmpty()){
30            int size=queue.size();
31            List<Integer> level=new ArrayList<>();
32              for (int i = 0; i < size; i++) {
33
34                TreeNode current = queue.poll();
35                level.add(current.val);
36
37                if (current.left != null) {
38                    queue.offer(current.left);
39                }
40
41                if (current.right != null) {
42                    queue.offer(current.right);
43                }
44            }
45            result.add(level);
46        }
47        return result;
48    }
49}