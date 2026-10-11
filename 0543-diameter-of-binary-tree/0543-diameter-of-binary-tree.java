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
    class Pair{
        int height;
        int diameter;

        public Pair(int height, int diameter){
            this.height =  height;
            this.diameter =  diameter;
        }

    }
    public int diameterOfBinaryTree(TreeNode root) {
        Pair ans  = solve(root);
        return ans.diameter;
    }

    public Pair solve(TreeNode root){
        if( root == null){
            return new Pair(0,0);
        }
        /////////
          Pair left = solve(root.left);
          Pair right =  solve(root.right);
          int height =  1 + Math.max(left.height, right.height);
          int currDiamete  = left.height + right.height;
          int totalDiamter =  Math.max(currDiamete, Math.max(left.diameter, right.diameter));

          return new Pair(height, totalDiamter);



    }
}