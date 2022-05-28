class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
		int longestStreak = 0, sum_i = 0, n = nums.length;
		map.put(0,1);

		for (int i = 0; i < n; i++) {
			sum_i += nums[i];

			if(map.containsKey(sum_i - k))	longestStreak += map.get(sum_i - k);
			map.put(sum_i, map.getOrDefault(sum_i, 0) + 1);
		}

		return longestStreak;
    }
}