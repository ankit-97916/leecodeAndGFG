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
    public TreeNode sortedArrayToBST(int[] arr) {
        return bst(arr, 0, arr.length-1);
    }
    public TreeNode bst(int[] arr, int si, int ei){
        if(si > ei){
            return null;
        }

         int mid = (si+ei)/2;
         TreeNode root = new TreeNode();
         root.val = arr[mid];
         root.left = bst(arr, si , mid-1);
         root.right = bst(arr, mid+1 , ei);
         return root;
    }
}