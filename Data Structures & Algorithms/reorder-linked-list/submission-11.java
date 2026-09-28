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
        ListNode f = head , s = head;

        while(f.next != null && f.next.next != null) {
            f = f.next.next;
            s = s.next;
        }

        ListNode temp = s;
        s = s.next;
        temp.next = null;

        s = reverseList(s);

       ListNode  l1 = head;
        
        while(l1 != null && s != null)  {
            ListNode t = l1.next;
            l1.next = s;
            s = s.next;
            l1 = l1.next;

            l1.next = t;
            l1 = l1.next;
            
            
        }
    }

    public ListNode reverseList(ListNode node) {

        ListNode prev = null;
        while(node != null) {
            ListNode temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
        }

        return prev;

    }
}
