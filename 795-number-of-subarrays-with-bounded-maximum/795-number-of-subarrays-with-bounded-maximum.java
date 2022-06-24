class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int res = 0, dp = 0, perv = -1;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= left && nums[i] <= right){
                dp = i - perv;
                res += dp;
            }
            else if(nums[i] < left)
                res += dp;
            else if(nums[i] > right){
                dp = 0;
                perv = i;
            }
        }   
        return res;
    }
}