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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode dummy = new ListNode(0);
        boolean first = true;

 

        while(list1 != null && list2 != null) {

            if(list1.val <= list2.val) {
                head.next = list1;
                 if(first) {

                    dummy = head;
                    first = false;   
                }
                head = head.next;
                list1 = list1.next;
               

            }
            else{
                head.next = list2;
                 if(first) {

                    dummy = head;
                    first = false;   
                }
                head = head.next;
                list2 = list2.next;
            }
   
        }
        
        while(list1 != null) {
            head.next = list1;
            list1 = list1.next;
            if(first) {

                    dummy = head;
                    first = false;   
                }
            head = head.next;
        }

        while(list2 != null) {
            head.next = list2;
            list2 = list2.next;
            if(first) {

                    dummy = head;
                    first = false;   
                }
            head = head.next;
        }


        return dummy.next;
    }
}