/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    public Node insert(Node head, int insertVal) {
        
        if(head == null) {
            head = new Node(insertVal);
            return head;
        }
        boolean toInsert = false;
        Node prev = head;
        Node curr = head.next;

        do{

            if(prev.val <= insertVal && curr.val >= insertVal) {
                toInsert = true;
            }

           else if(prev.val > curr.val) {

                if(insertVal >= prev.val || insertVal <= curr.val) {
                    toInsert = true;
                }
            }

            if(toInsert) {
                prev.next = new Node(insertVal , curr);
                return head;
            }

            prev = curr;
            curr = curr.next;


        }while(prev != head);
        


        prev.next = new Node(insertVal , curr);
        return head;
    }
}
