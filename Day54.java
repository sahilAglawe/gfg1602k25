// Question : Pair with given sum in a sorted array


class Solution {

    int countPairs(int arr[], int target) {
       int n = arr.length;
       int ans = 0;
       int i = 0, j = n-1;
       while(i < j) {
           int sum = arr[i] + arr[j];
           if(sum < target) {
               i++;
           } else if(sum > target){
               j--;
           } else {
               if(arr[i] == arr[j]){
                   int len = j - i + 1;
                   ans += (len*(len-1))/2;
                   break;
               } else {
                   int cntl = 0, cntr = 0;
                   int l = arr[i], r = arr[j];
                   while(i <= j && arr[i] == l){
                       i++;
                       cntl++;
                   }
                   while(i <= j && arr[j] == r){
                       j--;
                       cntr++;
                   }
                   ans += cntl*cntr;
               }
           }
       }
       return ans;
    }
}


// T/C: O(n)