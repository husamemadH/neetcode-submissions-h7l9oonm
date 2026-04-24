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
    public ListNode partition(ListNode head, int x) {
        ListNode smallList = new ListNode(0);
        ListNode bigList = new ListNode(0);
        ListNode bigListTail = bigList;
        ListNode smallListTail = smallList;
        
        while(head != null) {
            if(head.val < x) {
                smallListTail.next = head;
                smallListTail = smallListTail.next;
               
            }

            else{
                bigListTail.next = head;
                bigListTail = bigListTail.next;
                
            }
            head = head.next;
        
        }
     
        smallListTail.next = bigList.next;
        bigListTail.next=null;
        return smallList.next;

    }
}
