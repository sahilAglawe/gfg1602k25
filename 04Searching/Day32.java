// Question : find the kth element in two sorted arrays


class Solution {
    public int kthElement(int a[], int b[], int k) {
        int n = a.length;
        int m = b.length;
        
        if(n > m){
            return kthElement(b,a,k);
        }
        
        int low = Math.max(0, k-m);
        int high = Math.min(k,n);
        
        while(low <= high){
            int ca = (low + high) / 2;
            int cb = k - ca;
            
            int l1 = (ca == 0)? Integer.MIN_VALUE : a[ca-1];
            int l2 = (cb == 0)? Integer.MIN_VALUE : b[cb-1];
            int r1 = (ca == n)? Integer.MAX_VALUE : a[ca];
            int r2 = (cb == m)? Integer.MAX_VALUE : b[cb];
            
            if(l1 <= r2 && l2 <= r1){
                return Math.max(l1,l2);
            }
            else if(l1 > r2){
                high = ca - 1;
            }
            else low = ca + 1;
        }
        return -1;
    }
}