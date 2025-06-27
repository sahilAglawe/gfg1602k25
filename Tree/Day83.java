// Question : Mirror Tree


class Solution {
    
    void convert(Node root) {
        if(root == null) return;
        
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        convert(root.left);
        convert(root.right);
    }
    
    void mirror(Node node) {
        convert(node);
    }
}


// Time Complexity: O(N) where N is the number of nodes in the binary tree.
// Space Complexity: O(H) where H is the height of the tree due to recursion stack