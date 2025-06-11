// Question : Search in a Row-Column sorted matrix


class Solution {
    public static boolean matSearch(int mat[][], int x) {
        int n = mat.length;
        int m = mat[0].length;
        
        for(int i = 0; i<n; i++){
            int j = 0;
            while(j < m){
                if(mat[i][j] == x){
                    return true;
                }
                j++;
            }
        }
        return false;
    }
}