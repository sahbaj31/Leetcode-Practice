//160. Intersection of Two Linked Lists
//https://leetcode.com/problems/intersection-of-two-linked-lists/description/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = length(headA);
        int lenB = length(headB);
        ListNode tempA = headA;
        ListNode tempB = headB;
        if(lenA>lenB){
            int difference = lenA-lenB;
            for(int i=0; i<difference ; i++){
                tempA= tempA.next;
            }
            return getNode( tempA,  tempB);
            }
        
        else if(lenB>lenA){
            int difference = lenB-lenA;
            for(int i=0; i<difference ; i++){
                tempB= tempB.next;
            }
            return getNode( tempA,  tempB);
            
        }
        else{
            return getNode( tempA,  tempB);
        }
        
    }

    public ListNode getNode(ListNode tempA, ListNode tempB) {
        while(tempA!=tempB){
                tempA= tempA.next;
                tempB= tempB.next;
            }
            return tempA;
    }
    
    public int length(ListNode head){
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        return size;
    }
}