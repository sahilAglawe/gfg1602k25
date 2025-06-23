// Question : Word Search


class Solution {
    static public boolean isWordExist(char[][] mat, String word) {
        int n = mat.length;
        int m = mat[0].length;
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(dfs(mat, word,  i, j , 0)) {
                   return  true;
                }
            }
        }
        return false;
    }
    static public boolean dfs(char[][] mat, String word, int i, int j, int idx) {
        if(idx == word.length()) return true;
        
        if(i<0 || i>=mat.length || j<0 || j >= mat[0].length || mat[i][j] != word.charAt(idx)){
            return false;
        }
        char temp = mat[i][j];
        mat[i][j] = '#';
        boolean found = dfs(mat, word, i+1, j, idx+1) || dfs(mat, word, i-1, j, idx+1) || dfs(mat,word, i, j+1,idx+1)|| dfs(mat, word, i, j-1, idx+1); ;
        mat[i][j] = temp;
        return found;

    }
}

// Time Complexity: O(N * M * 4^L) where N is the number of rows, M is the number of columns, and L is the length of the word.
// Space Complexity: O(L) for the recursion stack, where L is the length of the word.