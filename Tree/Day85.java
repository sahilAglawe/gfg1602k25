// Question : Inorder Traversal



class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }
    
    public void inorder(Node node, ArrayList<Integer> list){
        if(node == null) return;
        inorder(node.left , list);
        list.add(node.data);
        inorder(node.right, list);
    }
}

// Time Complexity: O(N) where N is the number of nodes in the binary tree.
// Space Complexity: O(H) where H is the height of the tree due to recursion stack