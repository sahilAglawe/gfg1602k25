// Question : Rotate a Linked List


class Solution {
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
        
        Node current = head;
        int count = 1;
        
        // Traverse to the kth node
        while (count < k && current != null) {
            current = current.next;
            count++;
        }
        
        // If k >= length of list
        if (current == null) return head;
        
        Node kthNode = current;

        // Traverse to the last node
        while (current.next != null) {
            current = current.next;
        }

        // Connect last node to head
        current.next = head;

        // New head is (k+1)th node
        head = kthNode.next;

        // Break the link
        kthNode.next = null;

        return head;
    }
}

