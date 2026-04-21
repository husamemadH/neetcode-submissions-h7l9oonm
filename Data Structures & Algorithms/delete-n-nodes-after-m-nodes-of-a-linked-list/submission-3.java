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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        
        ListNode currentNode = head;
        ListNode lastMNode = head;

        while(currentNode != null) {

            int mCount = m;
            int nCount = n;

            while(currentNode != null && mCount != 0) {
                lastMNode = currentNode;
                currentNode = currentNode.next;
                
                mCount--;
            }

            while(nCount != 0 && currentNode != null) {
                currentNode = currentNode.next;
                nCount--;
            }

            lastMNode.next = currentNode;

        }
        return head;
    }
}
