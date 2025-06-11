// Question : Longest substring with distinct characters


class Solution {
    public int longestUniqueSubstr(String s) {
        int n = s.length();
        if(n == 0 || n == 1) return n;
        
        int arr[] = new int[26];
        int left = 0, right = 1;
        int count = 1;
        int max = count;
        
        arr[(int)(s.charAt(left) - 'a')]++;
        while(right < n) {
            int c = (int)(s.charAt(right) - 'a');
            
            if(arr[c] == 0 || left == right) {
                count++;
                arr[c]++;
                right++;
            }
            else {
                int d = (int)(s.charAt(left) - 'a');
                arr[d]--;
                count--;
                left++;
            }
            max = Math.max(count, max);
        }
        return max;
    }
}

// T/C: O(n)