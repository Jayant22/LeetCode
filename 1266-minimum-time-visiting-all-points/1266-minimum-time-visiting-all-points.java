class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        
        for(int i = 1; i < points.length; i++){
            int[] curr = points[i], perv = points[i - 1];
            res += Math.max(Math.abs(curr[0] - perv[0]), Math.abs(curr[1] - perv[1]));
        }
        
        return res;
    }
}