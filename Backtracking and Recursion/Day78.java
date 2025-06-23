// sudoku

class Solution {
    // Function to find a solved Sudoku.
    static void solveSudoku(int[][] mat) {
        solve(mat,0,0);
    }
    
    private static boolean solve(int[][]mat, int row, int col){
        if(col == 9){
            col = 0;
            row++;
        }
        if(row == 9) return true;
        
        if(mat[row][col] != 0) {
            return solve(mat, row, col+1);
        }
        for(int num = 0; num <= 9; num++){
            if(isSafe(mat,row, col, num)) {
                mat[row][col] = num;
                
                if(solve(mat, row, col+1)) return true;
                
                mat[row][col] = 0;
            }
        }
        return false;
    }
    private static boolean isSafe(int[][]mat, int row, int col, int num){
        for(int x=0; x<9; x++){
            if(mat[row][x] == num ) return false;
        }
        for(int x=0; x<9; x++){
            if(mat[x][col] == num ) return false;
    }
    int startRow = row - row % 3;
    int startCol = col - col % 3;
    for(int i = 0; i<3; i++){
        for(int j=0; j<3; j++){
            if(mat[startRow + i][startCol + j] == num) return false;
        }
    }
    return true;
}
}