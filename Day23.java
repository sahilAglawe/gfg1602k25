class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        int[] temp = new int[arr.length];
        return mergeSort(arr, temp , 0 , arr.length-1);
        
    }
    
    private static int mergeSort(int[] arr, int[] temp, int left, int right){
        int mid , inversionCount = 0;
        if(left < right) {
            mid = (left + right) / 2;
            
            inversionCount += mergeSort(arr, temp, left, mid);
            inversionCount += mergeSort(arr, temp, mid+1, right);
            
            inversionCount += merge(arr, temp, left, mid, right);
        }
        return inversionCount;
    }
    
    private static int merge(int[] arr, int[] temp, int left, int mid, int right){
        int i = left;
        int j = mid + 1;
        int k = left;
        int inversionCount = 0;
        
        while(i <= mid && j<= right) {
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                inversionCount += (mid - i + 1);
            }
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= right) {
            temp[k++] = arr[j++];
        }
        for(i = left; i<= right; i++){
            arr[i] = temp[i];
        }
        return inversionCount;
    }
}