// question : Add Number Linked Lists


class Solution {
    static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while(curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    
    static Node removeLeadingZeroes(Node head){
        while(head != null && head.data == 0){
            head = head.next;
        }
        return (head == null) ? new Node(0) : head;
    }


    static Node addTwoLists(Node num1, Node num2) {
     num1 = reverse(num1);
     num2 = reverse(num2);
     
     Node dummy = new Node(0);
     Node temp = dummy;
     int carry = 0;
     
     while(num1 != null || num2 != null || carry != 0){
         int sum = carry;
         
         if(num1 != null){
             sum += num1.data;
             num1 = num1.next;
         }
         
         if(num2 != null){
             sum += num2.data;
             num2 = num2.next;
         }
         
         carry = sum / 10;
         temp.next = new Node(sum % 10);
         temp = temp.next;
     }
     return removeLeadingZeroes(reverse(dummy.next));
    }

}
 
