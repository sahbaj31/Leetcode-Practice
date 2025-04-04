//19. Remove Nth Node From End of List
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode slow = head;
       ListNode fast = head;

       if(head.next==null) return head.next;

       for(int i =0; i<n; i++) {
        fast=fast.next;
       }
       if(fast==null){
        return head.next;
       }
       ListNode temp = head;
       while(fast.next!=null ){
        slow = slow.next;
        fast = fast.next;
       }
       slow.next= slow.next.next;
       return head;
    }
}

// Time Complexity: O(n)