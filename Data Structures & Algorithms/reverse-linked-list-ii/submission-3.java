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
        ListNode dummy = new ListNode(0 , head);
        ListNode lPrev = dummy , l = head;

        for(int i = 0 ; i < left - 1 ; i++) {
            lPrev = lPrev.next;
            l = l.next;
        }
        ListNode prev = null;
        for(int i = 0 ; i < right - left + 1; i++) {
            ListNode temp = l.next;
            l.next = prev;
            prev = l;
            l = temp;
        }

        lPrev.next.next = l;
        lPrev.next = prev;

        return dummy.next;

    }
}