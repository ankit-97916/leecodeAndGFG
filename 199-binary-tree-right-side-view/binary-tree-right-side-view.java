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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        right(root, 1, li);
        return li;
    }
    int depth = 0;
    public void right(TreeNode root, int currLevel, List<Integer> li){
        if(root == null){
            return ;
        }
        //
        if(depth < currLevel){
            li.add(root.val);
            depth =  currLevel;
        }
        right(root.right, currLevel+1, li);
        right(root.left, currLevel+1, li);

    }
}