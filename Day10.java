// Question : maximum subarray sum using kadane's algorithm.


class Solution {
    int maxSubarraySum(int[] arr) {
        int n = arr.length;
        int maxSum = arr[0];
        int currSum = arr[0];
        for(int i = 1; i< n; i++){
            currSum = Math.max(arr[i], arr[i] + currSum);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}

// T/C : O(n)
