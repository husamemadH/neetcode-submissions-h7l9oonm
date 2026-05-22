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
        ListNode f = head , s =head;

        while(f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
        }

        ListNode secondList = s.next;
        s.next = null;
        ListNode prev = null;

        while(secondList != null) {
            ListNode temp = secondList.next;
            secondList.next = prev;
            prev = secondList;
            secondList = temp;
        }

        secondList = prev;
        ListNode firstList = head.next;

        while(secondList != null && firstList != null) {
            ListNode temp1 = firstList.next;
            ListNode temp2 = secondList.next;
            head.next = secondList;
            head = head.next;
            head.next = firstList;
            head = head.next;

            firstList = temp1;
            secondList = temp2;
        }


        
    }
}
