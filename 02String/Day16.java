// Question : Anagram checks


class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        int n1 = s1.length();
        int n2 = s2.length();
        
        if( n1 != n2) return false;
        
        HashMap<Character, Integer> set  = new HashMap<>();
        for( int i = 0; i< n1; i++){
            char c = s1.charAt(i);
            set.put(c, set.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i< n2; i++){
            char c = s2.charAt(i);
            if(set.getOrDefault(c, 0) <= 0) return false;
            set.put(c, set.get(c) - 1);
        }
        return true;
    }
}


// T/C : O(n)