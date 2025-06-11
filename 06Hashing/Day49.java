// Question : Subarrays with sum K


class Solution {
    public int countSubarrays(int arr[], int k) {
        Map<Integer, Integer>presum = new HashMap<>();
        
        int res = 0;
        int cursum = 0;
        for(int i = 0; i < arr.length; i++){
            cursum += arr[i];
            if(cursum == k) {
                res++;
            }
            if(presum.containsKey(cursum - k)) {
                res+= presum.get(cursum-k);
            }
            presum.put(cursum, presum.getOrDefault(cursum, 0) + 1);
        }
        return res;
    }
}

// T/C : O(n)
