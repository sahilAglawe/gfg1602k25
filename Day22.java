// Question : Find H-Index
// Given an array of integers citations where citations[i] is the number of citations
// of the ith paper, return the index of the researcher.


class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        int max = 0;
        
        for(int  i = 0; i<n; i++){
            int h = n-i;
            if(citations[i] >= h){
                max = h;
                break;
            }
        }
        return max;
        
    }
}


// T/C: O(nlogn) 