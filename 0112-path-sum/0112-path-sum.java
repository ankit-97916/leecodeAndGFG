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
    public boolean hasPathSum(TreeNode root, int targetSum){
     return haspathSum(root, targetSum , 0);
    }
    public boolean haspathSum(TreeNode root, int targetSum, int currSum) {

        if(root == null){
            return false;
        }


        if(root.left == null && root.right == null){
            if(currSum + root.val == targetSum ){
                return true;
            }else{
                return false;
            }
            
        }
         
       
         boolean left = haspathSum(root.left,targetSum, currSum+root.val );
         boolean right = haspathSum(root.right, targetSum, currSum+root.val);
         if( left || right){
            return true;
         }else{
            return  false;
         }
    }
}