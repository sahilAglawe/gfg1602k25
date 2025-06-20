// Question : Implement Pow


class Solution {
    double pow(double b, int e){
        if(e == 0) return 1;
        double half = pow(b, e/2);
        if(e % 2 == 0) return half*half;
        else return half*half*b;
    }
    
    
    double power(double b, int e) {
        boolean sign = e >= 0;
        e = Math.abs(e);
        double result = pow(b,e);
        return sign ? result : 1/result;
    }
}

// Time Complexity: O(log n)
// Space Complexity: O(log n) due to recursion stack