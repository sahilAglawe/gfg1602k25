// Question : Implement atoi to convert a string to an integer.


class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int sign = 1;
        int result = 0;
        
        int i = 0;
        while(i < n && s.charAt(i) == ' '){
            i++;
        }
        if(i < n && s.charAt(i) == '-' || s.charAt(i) == '+'){
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            
            if(result > Integer.MAX_VALUE / 10 ||
            (result > Integer.MAX_VALUE / 10 && digit > 7 )) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }
        return sign * result;
    }
}