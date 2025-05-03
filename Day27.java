// Question : Merged two sorted arrays



class Day27 {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        
        int left = n-1;
        int right = 0;
        
        while(left >= 0 && right < m) {
            if(a[left] > b[right]){
                int temp = a[left];
                a[left] = b[right];
                b[right] = temp;
            }
            else break;
            left--;
            right++;
            
        }
        Arrays.sort(a);
        Arrays.sort(b);
        
    }
}