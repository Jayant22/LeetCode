class Solution {
    private int zeroCount;
    
    public int uniquePathsIII(int[][] grid) {
        int sx = 0, sy = 0;
        int n = grid.length, m = grid[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 0) zeroCount++;
                else if(grid[i][j] == 1){
                    sx = i;
                    sy = j;
                }
            }
        }
        
        return dfs(grid, sx, sy, new boolean[n][m]);
    }
    
    private int dfs(int[][] grid, int x, int y, boolean[][] visited){
        
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == -1 || visited[x][y])
            return 0;
        
        if(grid[x][y] == 2){
            if(zeroCount == 0) return 1;
            else return 0;
        }
        int res = 0;
        
        visited[x][y] = true;
        if(grid[x][y] == 0) zeroCount--;
        
        res += dfs(grid, x+1, y, visited);
        res += dfs(grid, x-1, y, visited);
        res += dfs(grid, x, y+1, visited);
        res += dfs(grid, x, y-1, visited);
        
        visited[x][y] = false;
        if(grid[x][y] == 0) zeroCount++;
        
        return res;
    }
}