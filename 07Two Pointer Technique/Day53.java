// Question : Sum Pair closest to target


class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
      
        ArrayList<Integer> list = new ArrayList<>();
        
        if(arr.length < 2){
            return list;
        }
        Arrays.sort(arr);
        
        int left = 0;
        int right = arr.length-1;
        int mindiff = Integer.MAX_VALUE;
        boolean found = false;
        int s1 = 0, s2 = 0;
        
        while(left < right){
        int currsum = arr[left] + arr[right];
        int diff = Math.abs(currsum - target);
        
        if(diff < mindiff) {
            mindiff = diff;
            s1 = arr[left];
            s2 = arr[right];
            found =  true;
            
        }if(currsum == target){
            break;
        } else if (currsum > target){
            right--;
        } else {
            left++;
        }
    }
    if(found){
        list.add(s1);
        list.add(s2);
    }
    return list;
}
}