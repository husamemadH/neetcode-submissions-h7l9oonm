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
   
        ListNode s = head , f = head;
        
        while(f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
        }

        ListNode second = s.next;
        s.next = null;
        ListNode prev = null;

        while(second != null) {
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }

        ListNode first = head.next;
        second = prev;
    while (first != null && second != null) {
          ListNode tmp1 = first.next;
          ListNode tmp2 = second.next;

          head.next = second;
          head = head.next;
          head.next = first;
          head = head.next;
          first = tmp1;
          second = tmp2;
        }
        
    }
}
