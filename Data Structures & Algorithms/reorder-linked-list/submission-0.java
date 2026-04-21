/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) {\ this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        
        ListNode slow = head , fast = head , prev = null;
        
        while(fast != null && fast.next != null) {
               prev = slow;
               slow = slow.next;
               fast = fast.next.next; 
        }

        prev.next = null;
        prev = null;
        while(slow != null ) {

            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;       
        }
        
       ListNode first = head;
       ListNode  second = prev;

        while(second != null && first != null) {

            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            if (tmp1 == null) break;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;


        }

        

        

    }
}