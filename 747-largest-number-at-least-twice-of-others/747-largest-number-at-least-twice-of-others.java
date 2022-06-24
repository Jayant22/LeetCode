class Solution {
    public int dominantIndex(int[] nums) {
        int[] sorted = nums.clone();
		int i = 0, len = nums.length;
		Arrays.sort(sorted);

		if(len == 1) return i;

		if((2 * sorted[len - 2]) <= sorted[len - 1]){
			for (i = 0; i < nums.length; i++) {
				if(sorted[len - 1] == nums[i])	break;
			}
		}else
			return -1;

		return i;
    }
}