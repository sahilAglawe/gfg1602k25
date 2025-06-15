// Question : Detect Loop in linked list



class Solution {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        if(head == null || head.next == null) return false;
        Node slow = head;
        Node fast = head.next;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        
        return false;
    }
}


// T/C: O(n)