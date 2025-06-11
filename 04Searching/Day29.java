// Question : Sorted and Rotated Minimum


class Solution {
    public int findMin(int[] arr) {
        int high = arr.length - 1;
        int low = 0;
        
        while(low < high){
            int mid = low + (high - low) / 2;
            if(arr[mid] > arr[high]) low = mid+1;
            else high = mid;
        }
        return arr[low];
    }
}
