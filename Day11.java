// Question : MAximum product subarray

class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        int n = arr.length;
        int maxProd = arr[0];
        int currMax = arr[0];
        int currMin = arr[0];
        
        for(int i = 1; i<n; i++){
            if(arr[i] < 0 ){
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }
            
            currMax = Math.max(arr[i] , currMax * arr[i]);
            currMin = Math.min(arr[i], currMin * arr[i]);
            
            maxProd = Math.max(maxProd, currMax);
        }
        return maxProd;
        }
}

// T/C: O(n) , S/C: O(1)

// it is a variation of kadane's algorithm.
