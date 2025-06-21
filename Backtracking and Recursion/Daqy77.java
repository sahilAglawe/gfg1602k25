// Question : N-Queen Problem



class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
       ArrayList<ArrayList<Integer>> result = new ArrayList<>();
       boolean[] cols = new boolean[n];
       boolean[] d1 = new boolean[2 * n];
       boolean[] d2 = new boolean[2 * n];
       ArrayList<Integer> current = new ArrayList<>();
       solve(0, n, cols, d1, d2, current, result);
       return result;
    }
    
    private void solve(int col, int n, boolean[] cols, boolean[] d1, boolean[] d2,
       ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
               if(col == n){
                   result.add(new ArrayList<>(current));
                   return;
               }
               
               for(int row= 0; row<n; row++){
                   int id1 = row - col + n;
                   int id2 = row + col;
                   if(cols[row] || d1[id1] || d2[id2])
                   continue;
                   
                   cols[row] = d1[id1] = d2[id2] = true;
                   current.add(row + 1);
                   
                   solve(col + 1, n, cols, d1, d2, current, result);
                   
                   cols[row] = d1[id1] = d2[id2] = false;
                   current.remove(current.size() - 1);
               }
         }
}

// Time Complexity: O(n!)
// Space Complexity: O(n) for the recursion stack and O(n^2) for the result storage