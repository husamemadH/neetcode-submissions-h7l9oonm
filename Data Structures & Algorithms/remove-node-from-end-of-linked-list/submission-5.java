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
        if(head.next == null) {
            return null;
        }
        ListNode f = head;
        ListNode remover = new ListNode(0 , head);

        for(int i = 0 ; i < n ; i++) {
            f = f.next;
        }

        while(f != null) {
            f = f.next;
            remover = remover.next;
        }
        if(remover.next == head) {
            return remover.next.next;
        }
        
        remover.next = remover.next.next;

        return head;


    }
}
