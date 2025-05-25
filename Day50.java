// Question : Count Subarrays with given XOR


class Solution {
    public long subarrayXor(int arr[], int k) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int xor = 0;
        int count = 0;
        
        for(int i = 0; i < n; i++) {
            xor ^= arr[i];
            
            if(xor == k) count++;
            
            count += map.getOrDefault((xor ^ k), 0);
            
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        
        return count++;
    }
}

// T/C: O(n)