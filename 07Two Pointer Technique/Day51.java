// Question : Count all triplets with given sum in sorted array


class Solution {
    public int countTriplets(int[] arr, int target) {
        int n = arr.length;
        int count = 0;
        
        for(int i=0; i<n; i++){
            int l = i+1;
            int r = n-1;
            while(l<r){
                int sum = arr[i] + arr[l] + arr[r];
                if(sum == target) {
                    if(arr[l] == arr[r]){
                        int len = r - l + 1;
                        count += (len * (len - 1)) / 2;
                        break;
                    }else {
                        int lcount = 1;
                        int rcount = 1;
                        while(l+1 < r && arr[l] == arr[l+1]) {
                            lcount++;
                            l++;
                        }
                        while(r-1 > l && arr[r] == arr[r-1]) {
                            rcount++;
                            r--;
                        }
                        count += lcount * rcount;
                        l++;
                        r--;
                    }
                    
                    }else if (sum < target){
                        l++;
                    } else {
                        r--;
                    }
                }
            }
            return count;
        }
    }


    // T/C : O(n^2)