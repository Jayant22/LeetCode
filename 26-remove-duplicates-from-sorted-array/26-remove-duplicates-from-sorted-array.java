class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        
        if(nums.length < 2) return nums.length;
        
        for(int i = 1; i < nums.length; ++i) 
            if(nums[i] != nums[i-1]) nums[index++] = nums[i];
        
        return index;
    }
}