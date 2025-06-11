// Question : Merge two sorted linked lists


/*
  Node is defined as
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        Node newHead = null;
        if(head1.data <= head2.data) {
            newHead = head1;
            head1 = head1.next;
        } else {
            newHead = head2;
            head2 = head2.next;
        }
        Node curr = newHead;
        
        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                curr.next = head1;
                curr = curr.next;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2 = head2.next;
                curr = curr.next;
            }
        }
        if(head1 != null){
            curr.next = head1;
        } else{
            curr.next = head2;
        }
        return newHead;
    }
}