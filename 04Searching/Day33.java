// Question : Aggressive cows
// problem : you have given n stalls and cows, you have to place cows in stalls such that minimum distance between any two cows is maximum

class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        int n = stalls.length;
        Arrays.sort(stalls);
        int l = 1;
        int d = stalls[n-1] - stalls[0];
        int res = 0;
        
        while(l <= d){
            int m = l+(d-l)/2;
            int count = 1;
            int placed = stalls[0];
            for(int i = 1; i<n; i++){
                if(stalls[i] - placed >= m){
                    count++;
                    placed = stalls[i];
                }
            }
            if(count >= k){
                res = m;
                l = m+1;
            } else {
                d = m-1;
            }
        }
        return res;
    }
}