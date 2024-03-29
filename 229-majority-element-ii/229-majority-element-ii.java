class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
		int candidate1 = nums[0], candidate2 = nums[0], count1 = 0, count2 = 0;
		for (int i = 0; i < nums.length; i++) {
			if(candidate1 == nums[i])	count1++;
			else if(candidate2 == nums[i])	count2++;
			else if(count1 == 0){
				candidate1 = nums[i];
				count1++;
			}else if(count2 == 0){
				candidate2 = nums[i];
				count2++;
			}else{
				count1--;
				count2--;
			}
		}

		count1 = 0;
		count2 = 0;

		for (int i = 0; i < nums.length; i++) {
			if (candidate1 == nums[i]) count1++;
			else if (candidate2 == nums[i]) count2++;
		}
		if(count1 > nums.length/3)	ans.add(candidate1);
		if(count2 > nums.length/3)	ans.add(candidate2);

		return ans;
    }
}