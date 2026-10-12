/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
         solve(root);
         return root;
    }

    public void solve(Node root ){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int level  = q.size();
            for(int i = 0; i<level; i++){
                Node remove = q.poll();

                if(i < level-1){
                    remove.next = q.peek();
                }

                if(remove.left != null){
                    q.add(remove.left);
                }

                if(remove.right != null){
                    q.add(remove.right);
                }
                
            }
        }
    }
}