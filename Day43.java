// Question : Count pairs with given sum


class Solution {

    int countPairs(int arr[], int target) {
        int n = arr.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        int cnt = 0;
        for(int i = 0; i<n; i++){
            if(freq.containsKey(target - arr[i])){
                cnt += freq.get(target - arr[i]);
            }
            freq.put((arr[i]), freq.getOrDefault(arr[i], 0) + 1);
        }
        return cnt;
    }
}