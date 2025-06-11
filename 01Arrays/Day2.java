// Question : push all zeroes to end of array

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length;
        int j = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}