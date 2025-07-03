// Question: Check for BST


class Solution {
    // Function to check whether a Binary Tree is BST or not.
    Node prev = null;
    
    boolean isBST(Node root) {
        return inorder(root);
    }
    
    boolean inorder(Node node){
        if(node == null) return true;
        if(!inorder(node.left)) return false;
        if(prev != null && node.data <= prev.data) return false;
        prev = node;
        return inorder(node.right);
    }
}

// Time Complexity: O(N) where N is the number of nodes in the binary tree.
// Space Complexity: O(H) where H is the height of the tree due to recursion stack