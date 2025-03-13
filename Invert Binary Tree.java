// 226. Invert Binary Tree
// https://leetcode.com/problems/invert-binary-tree/description/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void  helper(TreeNode root){
        if(root==null) return;
        TreeNode temp = root.left;
        root.left=root.right;
        helper(root.left);
        root.right=temp;
        helper(root.right);
    }
    public TreeNode invertTree(TreeNode root) {
        helper(root);
        return root;
    }
}