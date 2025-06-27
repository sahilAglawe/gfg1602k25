// Quetion : Diameter of a Binary Tree


class Solution {
    int max = 0;
    
    int search(Node root){
    if(root == null) return 0;
    int n1 = search(root.left);
    int n2 = search(root.right);
    
    max = Math.max(max, n1+n2);
    return Math.max(n1, n2) + 1;
    }
    
    int diameter(Node root) {
        search(root);
        return max;
    }
}

// Time Complexity: O(N) where N is the number of nodes in the binary tree.
