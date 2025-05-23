// Question : Print Anagrams Together



class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        
        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        
        for(String word : arr) {
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String str = new String(letters);
            
            if(!map.containsKey(str)) {
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(word);
        }
        for(List<String> set : map.values()) {
            list.add(new ArrayList<>(set));
        }
        return list;
    }
}


