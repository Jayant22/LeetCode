class Solution {
    public int maxFrequency(int[] nums, int k) {
        int left = 0, res = 1;
        long sumOfElementInWindow = 0; 
        Arrays.sort(nums);
        
        for(int right = 0; right < nums.length; ++right){
            sumOfElementInWindow += nums[right];
            
            while(noOfOperationsNeeded(left, right, sumOfElementInWindow, nums) > k){
                sumOfElementInWindow -= nums[left];
                left += 1;
            }
            
            res = Math.max(res, right - left +1);
        }
        
        return res;
    }
    
    long noOfOperationsNeeded(int start, int end, long sumOfElementInWindow, int[] A ){
        int numbersOfElements = end - start + 1, elementToReach = A[end];
    
        return((long) numbersOfElements * elementToReach) - sumOfElementInWindow;
    }
}