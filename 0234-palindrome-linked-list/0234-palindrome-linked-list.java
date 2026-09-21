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
class Solution {
    public boolean isPalindrome(ListNode head) {
        //first fidn middle of linked List -----
        if(head == null || head.next == null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse the second half of linked list---
        // mid slow --
        ListNode curr = slow;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // second half head is prev 
        /// compare the values reverse and loinked List;
        ListNode left = head;
        ListNode right =  prev;
        while(right != null){
            if(left.val != right.val){
                return false;

            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}