// Question : Permutations of a String



class Solution {
    public void back(char[] arr, boolean[] boo , StringBuilder str, ArrayList<String> list){
        if(str.length() == arr.length){
            list.add(str.toString());
            return;
        }
        
        for(int i = 0; i<arr.length; i++){
            if(boo[i]) continue;
            if(i > 0 && arr[i] == arr[i - 1] && !boo[i - 1]) continue;
            boo[i] = true;
            str.append(arr[i]);
            back(arr, boo, str, list);
            boo[i] = false;
            str.deleteCharAt(str.length() -1);
        }
    }
    
    public ArrayList<String> findPermutation(String s){
        StringBuilder str = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        
        boolean boo[] = new boolean[arr.length];
        back(arr, boo, str, list);
        
        return list;
    }
}