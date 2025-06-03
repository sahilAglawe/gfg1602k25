// Question : Trapping Rain Water


class Solution {
    public int maxWater(int arr[]) {
        int n = arr.length;
        int left = 0, right = n-1;
        int lmax = 0, rmax = 0, trapped = 0;
        while(left < right) {
            if(arr[left] < arr[right]) {
                if(arr[left] > lmax) {
                    lmax = arr[left];
                }
                else {
                    trapped += lmax - arr[left];
                }
                left++;
            }
            else {
                if(arr[right] > rmax){
                    rmax = arr[right];
                }
                else {
                    trapped += rmax - arr[right];
                }
                right--;
            }
        }
        return trapped;
    }
}

// T/C: O(n)