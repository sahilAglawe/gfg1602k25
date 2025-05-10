// Question : Allocate minimum number of pages

class Solution {
    public static int findPages(int[] arr, int k) {
        int n = arr.length;
        int low = 0;
        int high = 0;
        int result = -1;
        if(k > n) return -1;
        
        for(int pages : arr){
            low = Math.max(low, pages);
            high += pages;
        }
        
        while(low<=high){
            int mid = low + (high - low)/2;
            
            if(isPossible(arr,k,mid)){
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
        private static boolean isPossible(int[]arr, int k, int maxPages){
            int students = 1;
            int sum = 0;
            
            for(int pages : arr){
                if(sum + pages > maxPages) {
                    students++;
                    sum = pages;
                    if(students > k) return false;
                }
                else{
                    sum += pages;
                }
                
            }
            return true;
        }
        
    }
    
   
