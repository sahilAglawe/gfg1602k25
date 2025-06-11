// Question :Equilibrium Point


class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        int n = arr.length;
        int total = 0;
        for(int i = 0; i<n; i++){
            total += arr[i];
        }
        int left = 0;
        for(int i = 0; i<n; i++){
            total -= arr[i];
            if(left == total){
                return i;
            }
            left += arr[i];
        }
        return -1;
    }
}
