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
    public int diameterOfBinaryTree(TreeNode root) {
    if(root==null) return 0;
    int myDiameter =  (levels(root.left)+levels(root.right));
    int leftDiameter = diameterOfBinaryTree(root.left);
    int rightDiameter = diameterOfBinaryTree(root.right);
    return Math.max(myDiameter,Math.max(leftDiameter, rightDiameter));
    }
    private int levels(TreeNode root){
    if(root==null) return 0;
    return 1+(Math.max(levels(root.left),levels(root.right)));
    }
}