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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList();
        pathsum(root, targetSum, 0, ans, path);
        return ans;

        
    }
    public void pathsum(TreeNode root, int targetSum, int currSum,  List<List<Integer>> ans,  List<Integer> path ){
        //base case--
        if(root == null){
            return;
        }

        path.add(root.val);
        
        // leaft node 
        if(root.left == null && root.right == null){
            if(currSum+root.val == targetSum){
                ans.add(new ArrayList<>(path));
            }
            path.remove(path.size()-1);
            return ;
        }

        //explore left side --
        pathsum(root.left, targetSum, currSum+root.val, ans, path);
        //explore right side ---
        pathsum(root.right, targetSum, currSum+root.val, ans, path);
        path.remove(path.size()-1); ///back track 



    }
}