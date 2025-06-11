// Question: Non-overlapping Intervals


class Solution {
    static int minRemoval(int intervals[][]) {
        int cnt = 0;
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        
        int last = intervals[0][1];
        int n = intervals.length;
        
        for(int i = 1; i<n; i++){
            if(intervals[i][0] < last){
                cnt++;
                last = Math.min(intervals[i][1], last);
            }
            else {
                last = intervals[i][1];
            }
        }
        return cnt;
    }
}
