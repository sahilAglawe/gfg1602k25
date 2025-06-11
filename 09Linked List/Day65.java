// Question : Reverse a linked list


// function Template for Java

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution {
    Node reverseList(Node head) {
        if(head == null) return head;
        Node pre = null;
        Node curr = head;
        Node next = head.next;
        while(next != null) {
            curr.next = pre;
            pre = curr;
            curr = next;
            next = curr.next;
        }
        curr.next = pre;
        return curr;
    }
}
