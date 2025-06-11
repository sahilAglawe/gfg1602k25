// Question : Intersection of Two arrays with Duplicate Elements

class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        
        for(int i = 0; i<n; i++){
            map1.put(a[i], map1.getOrDefault(a[i], 0) + 1);
        }
        for(int j = 0; j<m; j++){
            map2.put(b[j], map2.getOrDefault(b[j], 0) + 1);
        }
        for(int key : map1.keySet()){
            if(map2.containsKey(key)) {
                list.add(key);
            }
        }
        return list;
    }
}

// T/C: O(n + m)