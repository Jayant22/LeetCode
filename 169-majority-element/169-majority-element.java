class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0], count = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                majority = nums[i];
                count++;
            }else if(majority == nums[i])   count++;
             else    count --;
        }
        
        return majority;
    }
}