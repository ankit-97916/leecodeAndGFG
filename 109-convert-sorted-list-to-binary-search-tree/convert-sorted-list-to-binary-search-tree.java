/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head ==  null){
            return null;
        }
        // find mid --
        ListNode  mid =  middle(head);
        TreeNode root =  new TreeNode(mid.val);
        if(head == mid){
            return root;
        }
        // mid tak ki linked list ko alag karo  -- 
        ListNode temp  = head;
        while(temp.next != mid){
            temp =  temp.next;
        }
        temp.next =  null;

        // call left and right list 
        root.left =  sortedListToBST(head);
        root.right = sortedListToBST(mid.next);
        return root;
        
    }

    // find mid of lined lst--
    public static ListNode middle(ListNode head){
        ListNode slow =  head;
        ListNode fast =  head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}