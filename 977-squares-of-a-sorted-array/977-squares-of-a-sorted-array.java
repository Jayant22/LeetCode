class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int l = 0, r = nums.length - 1;
        int index = nums.length - 1;
        while(l <= r){
            if(Math.abs(nums[l]) < Math.abs(nums[r])){
                arr[index--] = nums[r]*nums[r];
                r--;
            }else{
                arr[index--] = nums[l]*nums[l];
                l++;
            }
                
        }
        return arr;
    }
}