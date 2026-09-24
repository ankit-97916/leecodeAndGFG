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
    boolean found = true;
    public boolean isBalanced(TreeNode root) {
         height(root);
         return found;
    }

    
    public int height(TreeNode root){
        if(root == null){
            return -1;
        }
        int left = height(root.left);
        int right = height(root.right);
        int valid = Math.abs(left - right);
        if(valid > 1){
            found = false;
        }
        return Math.max(left, right)+1;

    }
}