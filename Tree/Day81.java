 // Question : Height of Binary Tree


class Solution {
    // Function to find the height of a binary tree.
    int height(Node node) {
        int count = -1;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty()) {
            int size = q.size();
            count++;
            for(int i = 0; i< size; i++) {
                Node temp = q.remove();
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
        }
        return count;
    }
}

// Time Complexity: O(N) where N is the number of nodes in the binary tree.
// Space Complexity: O(N) for the queue used in the level order traversal.