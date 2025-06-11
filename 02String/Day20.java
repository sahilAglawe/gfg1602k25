// Question : Strings Rotations of Each Other



class Day20 {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        
        if(n1 != n2) {
            return false;
        }
            String newS1 = s1 + s1;
            return kmpSubstring(newS1, s2);
        }
    public static boolean kmpSubstring(String Str1, String Str2){
        int[] lps = computeArray(Str2);
        int i = 0;
        int j = 0;
        
        while(i < Str1.length()){
            if(Str2.charAt(j) == Str1.charAt(i)){
                i++;
                j++;
            }
            if(j == Str2.length()){
                return true;
            } else if(i < Str1.length() && Str2.charAt(j) != Str1.charAt(i)) {
                if(j != 0){
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }
    
    public static int[] computeArray(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0;
        int i = 1;
        
        while(i < pattern.length()) {
            if(pattern.charAt(i) == pattern.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            } else {
                if(len != 0){
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
    }
