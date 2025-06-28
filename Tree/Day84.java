// Question: Construct Tree from Inorder & Preorder




class Solution {
    public static Node buildTree(int inorder[], int preorder[]) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i< inorder.length; i++){
            mp.put(inorder[i], i);
        }
        
        int[] preIdx = {0};
        return build(mp, preorder, preIdx, 0, inorder.length - 1);
    }
    
    public static Node build(Map<Integer, Integer> mp, int[] preorder, int[] preIdx, int left, int right){
        if(left > right) return null;
        
        int val = preorder[preIdx[0]];
        preIdx[0]++;
        Node root = new Node(val);
        
        int idx = mp.get(val);
        root.left = build(mp, preorder, preIdx, left, idx - 1);
        root.right = build(mp, preorder, preIdx, idx + 1, right);
        
        return root;
    }
}

// Time Complexity: O(N) where N is the number of nodes in the binary tree.
// Space Complexity: O(N) for the HashMap and O(H) for the recursion stack