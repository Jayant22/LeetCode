class Solution {
    public boolean check(int[] nums) {
        int irregularities = 0;
        
        for (int i = 1; i < nums.length; i++)
            if(nums[i - 1] > nums[i])
                irregularities++;
        
        if(nums[nums.length - 1] > nums[0])
            irregularities++;
        
        return irregularities <= 1;
    }
}