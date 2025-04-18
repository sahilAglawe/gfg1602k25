// Question : Find the smallest positive number missing from the array.


class Solution {
    
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int count = 1;
        
        for(int i = 0; i<n; i++){
            if(arr[i] < count) {
                continue;
            } else if( arr[i] == count) {
                count++;
            } else {
                return count;
            }
        }
        return count;
        
    }
}

// T/C : O(nlogn) , S/C: O(1)

