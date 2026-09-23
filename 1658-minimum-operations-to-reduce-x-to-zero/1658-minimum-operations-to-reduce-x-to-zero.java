class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int total = 0;
        
        for(int num : nums) total += num;
        int target = total - x;

        if(target < 0) return -1;

        int left = 0;
        int sum = 0;
        int max_sum = -1;
        
        for(int right = 0 ; right < n ; right++){
            sum+=nums[right];
            while(left<=right && sum > target){
                sum -= nums[left];
                left++;
            }
            if(sum == target){
                max_sum = Math.max(max_sum,right-left+1);
            }
        }
        return max_sum == -1 ? -1 : n-max_sum;
    }
}