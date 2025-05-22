// Question : Longest Consecutive Subsequence

class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        int res = 0;
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : arr){
            set.add(num);
        }
        
        for(int num : arr){
            if(set.contains(num) && !set.contains(num - 1)) {
                int count = 0, curr = num;
                while(set.contains(curr)) {
                    set.remove(curr);
                    curr++;
                    count++;
                }
                res = Math.max(res, count);
            }
        }
        return res;
    }
}