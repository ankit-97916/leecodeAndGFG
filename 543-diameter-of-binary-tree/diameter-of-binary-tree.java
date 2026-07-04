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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        // optimize  appproach -
        height(root);
        return diameter;
        
    }

    public  int  height(TreeNode node){
        if(node == null){
            return 0;
        }
        //
        int leftheight = height(node.left);
        int rightHeight = height(node.right);
        int currdiameter = leftheight + rightHeight; // curr dimater
        diameter = Math.max(currdiameter , diameter);
        return Math.max(leftheight, rightHeight)+1;

    }
}