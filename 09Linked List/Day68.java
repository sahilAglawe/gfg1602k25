// Question : Linked List Group Reverse


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node reverseKGroup(Node head, int k) {
        if(head == null || k <= 1) return head;
        
        Node dummy = new Node(0);
        dummy.next = head;
        Node prevGroupEnd = dummy;
        
        while(true) {
            Node groupStart = prevGroupEnd.next;
            Node groupEnd = prevGroupEnd;
            
            int count = 0;
            while(count < k && groupEnd != null){
                groupEnd = groupEnd.next;
                count++;
            }
            
            if(groupEnd == null){
                Node temp = groupStart;
                Node remaining = null;
                while(temp != null) {
                    Node next = temp.next;
                    temp.next = remaining;
                    remaining = temp;
                    temp = next;
                }
                prevGroupEnd.next = remaining;
                break;
            }
            Node nextGroupStart = groupEnd.next;
            groupEnd.next = null;
            
            Node reversedHead = reverseList(groupStart);
            prevGroupEnd.next = reversedHead;
            
            groupStart.next = nextGroupStart;
            prevGroupEnd = groupStart;
        }
        return dummy.next;
    }
    private static Node reverseList(Node head){
        Node prev = null, curr = head;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}