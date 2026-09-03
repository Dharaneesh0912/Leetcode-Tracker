// Last updated: 9/3/2026, 10:02:06 AM
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
17    int count = 0;
18    public int kthSmallest(TreeNode root, int k) {
19        return k_inorder(root , k);
20    }
21    int k_inorder(TreeNode root , int k){
22        if(root == null){
23            return -1;
24        }
25        int left = k_inorder(root.left , k);
26        if(left != -1){
27            return left;
28        }
29        count++;
30        if(count == k){
31            return root.val;
32        }
33        int right = k_inorder(root.right , k);
34        return right;
35    }
36}