// Question : Clone List with Next and Random


class Solution {
    public Node cloneLinkedList(Node head) {
        if(head == null) return null;
        
        Node curr = head;
        while(curr != null) {
            Node clone = new Node(curr.data);
            clone.next = curr.next;
            curr.next = clone;
            curr = clone.next;
        }
        
        curr = head;
        while(curr != null){
            if(curr.random != null)
                curr.next.random = curr.random.next;
                curr = curr.next.next;
            }
            
            curr = head;
            Node dummy = new Node(0);
            Node cloneCurr = dummy;
            
            while(curr != null){
                cloneCurr.next = curr.next;
                curr.next = curr.next.next;
                
                curr = curr.next;
                cloneCurr = cloneCurr.next;
            }
            return dummy.next;
        }
    }