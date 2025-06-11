// Question : Given two binary strings a and b , return their sum as a binary string.


class Solution {
    public String addBinary(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int sum = 0;
        int i = n1 - 1;
        int j = n2 - 1;
        
        while(i>= 0 || j>= 0 || carry != 0){
            int digit1 = (i >= 0) ? s1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? s2.charAt(j) - '0' : 0;
            
            sum = digit1 + digit2 + carry;
            result.append(sum % 2);
            carry = sum/2;
            i--;
            j--;
        }
        result.reverse();
        int start = 0;
        while(start < result.length() && result.charAt(start) == '0'){
            start++;
        }
        if(start == result.length()){
            return "0";
        }
        return result.substring(start);
    }
}