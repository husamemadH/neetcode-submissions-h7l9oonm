 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode curr = headA;
        int lengthA = 0 , lengthB = 0;

        while(curr != null) {
        lengthA ++;
        curr = curr.next;
        }
        curr = headB;
        while(curr != null) {
        lengthB ++;
        curr = curr.next;
        }
        if(lengthA > lengthB) {
            for(int i = 0 ; i < lengthA - lengthB ; i++) {
                headA = headA.next;
            }
        }

        if(lengthA < lengthB) {
            for(int i = 0 ; i < lengthB - lengthA ; i++) {
                headB = headB.next;
            }
        }

        while(headA != null && headB != null) {
            if(headA == headB)
            return headA;

            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}