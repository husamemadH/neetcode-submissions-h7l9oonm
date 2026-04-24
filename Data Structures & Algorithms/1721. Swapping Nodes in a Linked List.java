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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode f = head , s = head;

        for(int i = 0 ; i < k - 1 ; i++) {
            f = f.next;;
        }

        while(f.next != null) {
            
            f = f.next;
            s = s.next;
        }

        ListNode iter = head;

        for(int i = 0 ; i < k - 1 ; i++) {
            iter = iter.next;;
        }

        int temp = iter.val;
        iter.val = s.val;
        s.val = temp;

        return head;
    }
}
