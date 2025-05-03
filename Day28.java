// Question : count frequency of an element in an array.
//Given a sorted array, arr[] and a number target, you need to find the number of occurrences of target in arr[]. 

class Solution {
    int countFreq(int[] arr, int target) {
        int n = arr.length;
        int count = 0;
        
        for(int i = 0; i< n; i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }
}
