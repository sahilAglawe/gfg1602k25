// Question : Count the number of possible triangles


class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        int n = arr.length;
        int count = 0;
        Arrays.sort(arr);
        for(int k = n - 1; k>=2; k--){
            int i = 0;
            int j = k-1;
            while(i < j){
                int sum = arr[i] + arr[j];
                if(sum > arr[k]) {
                    count += j-i;
                    j--;
                } else {
                    i++;
                }
            }
        }
        return count;
    }
}