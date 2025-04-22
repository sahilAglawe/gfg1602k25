// Question : Find the first non repeating character in a string


class Solution {
    static char nonRepeatingChar(String s) {
        int arr[] = new int[26];
        for(int i = 0; i<s.length(); i++){
            int c = s.charAt(i) - 'a';
            arr[c]++;
        }
        for(int i = 0; i<s.length(); i++){
            int c = s.charAt(i) - 'a';
            if(arr[c] == 1) return s.charAt(i);
        }
        return '$';
    }
}

