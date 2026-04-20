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
        ListNode prev = new ListNode(0);
        ListNode curr = head;

        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            
        }

        return prev;
            


    }
    public boolean isPalindrome(ListNode head) {
        
        ListNode counter = head;
        int length = 0;

        while(counter != null) {
            length++;
            counter = counter.next;
        }

        ListNode reversed = head;
        int middle = length / 2;

        for(int i = 0 ; i  < middle ; i++) {
            reversed = reversed.next;
        }
        reversed = reverseList(reversed);

        
        for(int i = 0 ; i  < middle ; i ++) {
            if(head.val != reversed.val) {
                return false;
            }
            head = head.next;
            reversed = reversed.next;
        }

    return true;
    }
}