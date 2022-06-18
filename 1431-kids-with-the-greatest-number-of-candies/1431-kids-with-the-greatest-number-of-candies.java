class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> res = new ArrayList<Boolean>();
        
        int gauge = 0;
        
        for(int i = 0; i < n; i++){
            gauge = Math.max(candies[i], gauge);
        }
        
        gauge -= extraCandies;
        for (int candy : candies) {
            res.add(candy >= gauge);
        }
        return res;
    }
}