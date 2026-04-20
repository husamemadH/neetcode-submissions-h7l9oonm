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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        while(head != null && head.val == val) {
            
                head = head.next;
                 dummy.next = head;
            
        }

        while(head != null && head.next != null) {

            if(head.next.val == val) {
                head.next = head.next.next;
            }
            else{
                head = head.next;
            }
        }

        return dummy.next;
    }
}