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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }

        return prev;
    }

    public int pairSum(ListNode head) {
        
        ListNode fast = head , slow = head;
        
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }


        slow = reverseList(slow);

        int maxTwin = 0;
        
        while(slow != null) {

            maxTwin = Math.max(maxTwin , head.val + slow.val);

            slow = slow.next; 
            head = head.next;

            
        }

        return maxTwin;
    }
}