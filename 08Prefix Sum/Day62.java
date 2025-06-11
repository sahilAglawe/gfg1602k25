// Question : Longest Subarray with sum k

class Solution {
    public int lenOfLongSubarr(int[] A, int N, int K) {
        // HashMap to store (sum, index)
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;
        
        for (int i = 0; i < N; i++) {
            sum += A[i];

            // If subarray from 0 to i has sum K
            if (sum == K)
                maxLen = i + 1;

            // If (sum - K) is seen before, update maxLen
            if (map.containsKey(sum - K))
                maxLen = Math.max(maxLen, i - map.get(sum - K));

            // Store sum in map if not already present
            if (!map.containsKey(sum))
                map.put(sum, i);
        }
        
        return maxLen;
    }
}


