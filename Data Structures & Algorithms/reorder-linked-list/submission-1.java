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
    public void reorderList(ListNode head) {
        
       ListNode fast = head;
       ListNode slow = head;
    
       while(fast != null && fast.next != null) {
        
        fast = fast.next.next;
        slow = slow.next;
       }
       
       ListNode secondHalf = slow.next;
       slow.next = null;
        ListNode prev = null;

       while(secondHalf != null) {
        ListNode temp = secondHalf.next;
        secondHalf.next = prev;
        prev = secondHalf;
        secondHalf = temp;
       }

       ListNode first = prev;
       ListNode second = head.next;

       while(first != null && second != null) {
        ListNode temp1 = first.next;
        ListNode temp2 = second.next;
        head.next = first;
        head = head.next;
        head.next = second;
        head = head.next;
        first = temp1;
        second = temp2;
       }
    }
}
