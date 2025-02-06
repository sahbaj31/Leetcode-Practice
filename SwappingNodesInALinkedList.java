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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode first=head;
        for(int i=1; i<=k-1;i++){
            fast=fast.next;
            first=first.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        int temp = first.val;
        first.val=slow.val;
        slow.val =temp;

        return head;

    }
}