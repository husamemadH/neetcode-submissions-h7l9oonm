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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        while(head != null && head.next != null) {
            int keep = m;
            int remove = n;
            for(int i = 0 ; i < keep - 1 ; i++) {
                if(head != null) {
                    head = head.next;
                }
            }

            for(int i = 0 ; i < remove ; i++) {
                if(head != null && head.next != null) {
                    head.next = head.next.next;
                }
            }
            if(head != null)
            head = head.next;
        }
        return dummy.next;
    }
}
