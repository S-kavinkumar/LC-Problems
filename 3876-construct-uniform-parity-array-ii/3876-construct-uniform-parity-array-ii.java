class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        for(int n : nums1){
            min = Math.min(min, n);
        } if(min % 2 != 0){
            return true;
        }
        for(int num : nums1){
            if(num % 2 != 0){
                return false;
            }
        }
        return true;
    }
}