// Question : Remove loop in Linked List



class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        if(head == null || head.next == null) return;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                while(fast.next != slow){
                    fast = fast.next;
                }
                fast.next = null;
            }
        }
    }
}
