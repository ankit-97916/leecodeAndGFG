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
    public List<String> binaryTreePaths(TreeNode root) {
         List<String> li = new ArrayList<>();
         paths(root, li, "");
         return li;
    }
    public void paths(TreeNode root, List<String> list, String s){
        if(root == null){
            return;
        }
        s = s+root.val;
        if(root.left == null && root.right == null){
            list.add(s);
        }
          s= s+"->";
        paths(root.left, list, s);
        paths(root.right, list, s);

    }
}