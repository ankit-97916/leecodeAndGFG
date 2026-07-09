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
    public List<List<Integer>> levelOrder(TreeNode root) {
        return level(root);

    }

    public List<List<Integer>> level(TreeNode root ){
        List<List<Integer>> ans = new ArrayList<>();
        if(root ==  null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> li = new ArrayList<>();

            for(int i=0; i<size; i++){
                TreeNode remove = q.poll();
                li.add(remove.val);

                if(remove.left != null){
                    q.add(remove.left);
                }

                if(remove.right != null){
                    q.add(remove.right);
                }
            }

            ans.add(li);
        }

        return ans;
    }
}