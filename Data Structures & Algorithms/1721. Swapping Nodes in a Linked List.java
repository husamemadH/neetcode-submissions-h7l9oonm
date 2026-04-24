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

    private ListNode reverseList(ListNode head) {

        ListNode prev = null;
        while(head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }

        return prev;
    }
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode dummy = new ListNode(0 , head);

        head = reverseList(head);

        ListNode p1 = head;

        for(int i = 0 ; i < k - 1 ; i++) {
            p1 = p1.next;
        }

        head = reverseList(head);

        for(int i = 0 ; i < k - 1 ; i++) {
            head = head.next;
        }

        int temp = head.val;
        head.val = p1.val;
        p1.val = temp;

        return dummy.next;


    }
}
