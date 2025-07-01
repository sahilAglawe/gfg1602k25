// Question : Maximum path sum from any node



class Solution {
    // Function to return maximum path sum from any node in a tree.
    int maxPathSum(Node root, int[] res){
        if(root == null) return 0;
        int l = Math.max(0, maxPathSum(root.left, res));
        int r = Math.max(0, maxPathSum(root.right, res));
        
        res[0] = Math.max(res[0], l+r+root.data);
        
        return root.data + Math.max(l, r);
        }
    int findMaxSum(Node node) {
        // your code goes here
        int[] res = {node.data};
        maxPathSum(node, res);
        return res[0];
    }
}

// Time Complexity: O(N) where N is the number of nodes in the binary tree.
// Space Complexity: O(H) where H is the height of the tree due to recursion stack