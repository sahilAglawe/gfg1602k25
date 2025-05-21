// Question : Union of Arrays with Duplicates


class Solution {
    public static int findUnion(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : a){
            set.add(num);
        }
        for(int num : b){
            set.add(num);
        }
        return set.size();
    }
}