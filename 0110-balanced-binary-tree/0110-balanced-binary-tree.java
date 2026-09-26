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
    public boolean isBalanced(TreeNode root) {
        Pair ans  = solve(root);
        return ans.balanced;
    }
    class Pair{
        int height;
        boolean balanced;
        public Pair(int height, boolean balanced){
            this.height =  height;
            this.balanced =  balanced;
        }
    }

    public Pair solve(TreeNode root){
        if(root == null){
            return new Pair(0, true);
        }

        Pair left =  solve(root.left);
        Pair right =  solve(root.right);
        int height =  Math.max(left.height, right.height)+1;
        int valid =  Math.abs(left.height - right.height);
        boolean balance  =  true;
        if(valid > 1){
            balance  =  false;
        }
       if(!left.balanced || !right.balanced){
        balance = false;
       }
        return new Pair(height, balance);
    }
}