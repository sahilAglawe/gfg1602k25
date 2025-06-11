// Question : Count Pairs whose sum is less than target


class Solution {
    int countPairs(int arr[], int target) {
        int n = arr.length;
        int count = 0;
        Arrays.sort(arr);
        
        int i = 0;
        int j = n - 1;
        while(i < j) {
            int sum = arr[i] + arr[j];
            if(sum < target) {
                count += j - i;
                i++;
            } else {
                j--;
            }
        }
        return count ;
    }
}

