public class Solution {
    public int minPathSum(int[][] grid) {
        int m = 0;
        int[][] damn = new int[grid.length][grid[0].length];
        m = dfs(0,0,grid,damn);
        return m;
    }
    
    public int dfs(int i,int j, int[][] grid,int[][] damn){
        int n = grid.length-1; int m = grid[0].length-1;
        if(i == grid.length-1 && j ==grid[0].length-1){
            return grid[i][j];
        }
        if(damn[i][j] !=0){
            return damn[i][j];
        }
        
        if(i<n && j<m){
            int k = grid[i][j]+dfs(i+1,j,grid,damn);
            int l = grid[i][j]+dfs(i,j+1,grid,damn);
            damn[i][j] = Math.min(k,l);
            return damn[i][j];
        } 
        if(i<n){
            return grid[i][j]+dfs(i+1,j,grid,damn);
        }
        
         if(j<m){
            return grid[i][j]+dfs(i,j+1,grid,damn);
        }
        return 0;
    }
}
