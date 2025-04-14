// Question : Minimize the Heights II


class Solution {
    int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        int diff = 0;
        
        Arrays.sort(arr);
        
        int min = arr[0];
        int max = arr[n-1];
        diff = max - min;
        
        for(int i= 1; i<n; i++){
            if(arr[i] -k <0){
                continue;
            }
            int currMin = Math.min(arr[0] + k, arr[i] - k);
            int currMax = Math.max(arr[i-1]+ k, arr[n-1] - k);
            int currDiff = currMax - currMin;
            diff = Math.min(diff, currDiff);
        }
        return diff;
    }
}

// TC: O(nlogn) + O(n) = O(nlogn)

