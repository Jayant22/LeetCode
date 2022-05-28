class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
		int longestStreak = 0, n = s.length();

		for (int i = 0, innerStreak = 0; i < n; i++) {
			if(map.containsKey(s.charAt(i)))	innerStreak = Math.max(map.get(s.charAt(i)), innerStreak);

			longestStreak = Math.max(longestStreak, (i-innerStreak+1));
			map.put(s.charAt(i),i+1);
		}

		return longestStreak;
    }
}