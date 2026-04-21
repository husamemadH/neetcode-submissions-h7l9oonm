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

            ListNode prev = new ListNode();
            ListNode curr = head;
            prev.next = curr;
            
            if(head.next == null) {
                return null;
            }

            int length = 0;
            ListNode iterator = head;
            while(iterator != null) {
                length++;
                iterator = iterator.next;
            }
            int indexToRemove = length - n;
            if(indexToRemove == 0) {

                prev.next = curr.next;
                return prev.next;

            }

            for(int i = 0 ; i < indexToRemove ; i++) {
                curr = curr.next;
                prev = prev.next;
            }

            prev.next = curr.next;
            
            return head;
    }
}
