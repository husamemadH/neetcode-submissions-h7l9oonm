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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode afterRight = head;
        for(int i = 0 ; i < right  ; i ++) {
            afterRight = afterRight.next;
        }
        ListNode l = new ListNode(0);
        l.next = head;
        ListNode lPrev = new ListNode(0);
        lPrev.next =l;
        for(int i = 0 ; i < left ; i++) {
            lPrev = lPrev.next;
            l = l.next;
        }
        
        ListNode curr = l;
        ListNode dummy = new ListNode(0);
        dummy.next = head;


        ListNode prev = null;
        while(curr != afterRight) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        lPrev.next = prev;
        if(left == 1) {
            dummy.next = prev;
        }
        if(afterRight != null) 
        l.next = afterRight;
        
        return dummy.next;

    }
}