class Solution {
    public static int[] computeLPS(String s) {
        int n = s.length();
        int[] lps = new int[n];
        
        lps[0] = 0;
        int len = 0;
        
        int i =1;
        while(i < n){
            if(s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if(len != 0) {
                    len = lps[len -1];
                } 
                else 
                   {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
    
    public static int minChar(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + '#' + rev;
        int[] lps = computeLPS(combined);
        return s.length() - lps[combined.length() - 1];
    }
}

// T/C : O(n)
