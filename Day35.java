// Question : Kth Missing Positive Number in a Sorted Array
// problem : Given an array arr of positive integers sorted in a strictly increasing order,
// to find the kth positive integer that is missing from this array.


class Solution {
    public int kthMissing(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int res = arr.length + k;
        
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > mid + k){
                res = mid + k;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}