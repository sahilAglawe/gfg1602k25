// Question : sort an array of 0s, 1s, and 2s

class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        int n = arr.length;
        int count[] = new int[3];
        
        for(int num : arr){
            count[num]++;
        }
        int idx = 0;
        for(int i = 0; i< count.length; i++){
            while(count[i] > 0){
                arr[idx] = i;
                idx++;
                count[i]--;
            }
        }
    }
}


// T/C: O(n)
// S/C: O(1)
