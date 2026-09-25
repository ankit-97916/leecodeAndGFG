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
         Pair ans = Balance(root);
         return ans.balance;
    }

    class Pair{
        int height;
        boolean balance;
        public Pair(int height, boolean balance){
            this.height =  height;
            this.balance = balance;
        }
    }

    public Pair Balance(TreeNode root){
        if(root == null){
            return new Pair(0,true);
        }

        Pair left = Balance(root.left);
        Pair right = Balance(root.right);
        int height = Math.max(left.height, right.height)+1;
        boolean balance = true;
        int valance = Math.abs(left.height - right.height);
        if(valance > 1){
            balance = false;
        }

        if(!left.balance || !right.balance){
               balance = false;
        }

        return new Pair(height, balance);
    }
}