// Question : maximum sum circular subarray

class Solution {

    public int circularSubarraySum(int arr[]) {
        int n = arr.length;
        int max = 0;
        int sum = 0;
        int min = 0;
        int finalMax = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        
        for(int i=0; i< n; i++){
            sum += arr[i];
            max = Math.max(arr[i], max + arr[i]);
            maxSum = Math.max(max, maxSum);
            min = Math.min(arr[i], min + arr[i]);
            minSum = Math.min(min , minSum);
        }
        if(maxSum < 0){
            return maxSum;
        }
        finalMax = sum - minSum;
        return Math.max(maxSum , finalMax);
        
    }
}


// T/C: O(n) , S/C: O(1)