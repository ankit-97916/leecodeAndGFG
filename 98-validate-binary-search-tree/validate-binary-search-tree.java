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
    public boolean isValidBST(TreeNode root) {
        if(root == null ){
            return true;
        }
        if(  minimum(root.right) <= root.val){
            return false;
        }

        if( maximum(root.left) >= root.val){
            return false;
        }
        return isValidBST(root.left)&&isValidBST(root.right);
    }

    public static long maximum(TreeNode root){
      if(root == null){
        return  Long.MIN_VALUE;
      }
      long left = maximum(root.left);
      long right = maximum(root.right);
      return Math.max(root.val , Math.max(left, right));
    }

     public static long minimum(TreeNode root){
      if(root == null){
        return  Long.MAX_VALUE;
      }
      long left = minimum(root.left);
      long right = minimum(root.right);
      return Math.min(root.val , Math.min(left, right));
    }
}