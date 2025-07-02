// Question :K Sum Paths


class Solution {
    
    public int pathSum(Node root, int k, int curr, HashMap<Integer, Integer> map ){
        if(root == null) return 0;
        
        int count = 0;
        curr += root.data;
        
        if(curr == k) count++;
        count += map.getOrDefault(curr - k, 0);
        map.put(curr, map.getOrDefault(curr, 0) +1);
        count += pathSum(root.left, k, curr, map);
        count += pathSum(root.right, k, curr, map);
        map.put(curr, map.get(curr) -1);
        return count;
    }
    
  public int sumK(Node root, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return pathSum(root, k, 0, map);
    }
};

// Time Complexity: O(N) where N is the number of nodes in the binary tree.
// Space Complexity: O(N) for the HashMap used to store the cumulative sums and their