// Question : Two Sum - Pair with Given Sum

class Solution {
    boolean twoSum(int arr[], int target) {
        int n = arr.length;
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<n; i++){
            int num = target - arr[i];
            
            if(set.contains(num)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}