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
    public ListNode plusOne(ListNode head) {
        
        int carry = 1;

        ListNode prev = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        ListNode prev2 = prev;
          
      ListNode  prev4 = new ListNode(0 , prev);
        while(prev != null) {

            int sum = prev.val + carry;

            carry = sum / 10;
            prev.val = sum % 10;
            prev4 = prev4.next;
            prev = prev.next;
        }

        if(carry != 0) {
            prev4.next = new ListNode(carry);
            
        }

        ListNode prev3 = null;
        while(prev2 != null){
            ListNode temp = prev2.next;
            prev2.next = prev3;
            prev3 = prev2;
            prev2 = temp;

        }

        return prev3;


    }
}
