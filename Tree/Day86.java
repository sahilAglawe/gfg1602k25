// Question : Tree Boundary Traversal



class Solution {
    ArrayList<Integer> boundaryTraversal(Node node) {
       ArrayList<Integer> res = new ArrayList<>();
       
       if(node == null) return res;
       if(!isLeaf(node)) res.add(node.data);
       leftBoundary(node.left, res);
       addLeaves(node, res);
       rightBoundary(node.right, res);
       
       return res;
    }
    
    boolean isLeaf(Node node){
        return (node.left == null && node.right == null);
    }
    
    void leftBoundary(Node node, ArrayList<Integer> res){
        while(node != null){
            if(!isLeaf(node)) res.add(node.data);
            if(node.left != null) node = node.left;
            else node = node.right;
        }
    }
    void rightBoundary(Node node, ArrayList<Integer> res){
        Stack<Integer> temp = new Stack<>();
        while(node != null){
            if(!isLeaf(node)) temp.push(node.data);
            if(node.right != null) node = node.right;
            else node = node.left;
        }
        while(!temp.isEmpty()){
            res.add(temp.pop());
        }
    }
    void addLeaves(Node node, ArrayList<Integer> res){
        if(isLeaf(node)){
            res.add(node.data);
            return;
        }
        if(node.left != null) addLeaves(node.left , res);
        if(node.right != null) addLeaves(node.right, res);
    }
}

// Time Complexity: O(N) where N is the number of nodes in the binary tree.
// Space Complexity: O(H) where H is the height of the tree due to recursion stack