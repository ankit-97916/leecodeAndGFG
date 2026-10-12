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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        average(root , ans);
        return ans;
    }
    //
    public void average(TreeNode root, List<Double> ans){
     if(root == null){
        return ;

     }
     Queue<TreeNode> q = new LinkedList<>();
     q.add(root);
     while(!q.isEmpty()){
        int level =  q.size();
        double sum  = 0;

        for(int i =0; i<level; i++){
            TreeNode remove =  q.poll();
            sum+= remove.val;

            if(remove.left != null){
                q.add(remove.left);
            }
            //
            if(remove.right != null){
                q.add(remove.right);
            }
        }
           double average = (double) sum / level;
           ans.add(average);
     }
    }
}