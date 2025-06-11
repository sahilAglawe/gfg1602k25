// Question : Largest subarray of 0's and 1's


class Solution {
    int maxLen(int[] arr, int N) {
        // Map to store (sum, index)
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < N; i++) {
            // Convert 0 to -1
            int val = (arr[i] == 0) ? -1 : 1;
            sum += val;

            if (sum == 0)
                maxLen = i + 1;

            if (map.containsKey(sum))
                maxLen = Math.max(maxLen, i - map.get(sum));
            else
                map.put(sum, i);
        }
        return maxLen;
    }
}

