// Question : Container With Most Water


class Solution {

    public int maxWater(int arr[]) {
        int n = arr.length;
        int i = 0, j = n-1;
        int total = 0;
        while(i < j) {
            int diff = j - i;
            int height = Math.min(arr[i], arr[j]);
            total = Math.max(total , height * diff);
            
            if(arr[i] < arr[j]) {
                i++;
            }else {
                j--;
            }
        }
        return total;
    }
}

// T/C: O(n)