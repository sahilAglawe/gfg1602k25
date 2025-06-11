// Problem : Second Largest Element in an array.

class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        int secMax = -1;
        int cnt = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            } else if(arr[i] > secMax && arr[i] < max){
                secMax=arr[i];
            }
            }
            return secMax;
        }
        
    }
