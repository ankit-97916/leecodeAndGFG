class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {

        int[][] dp = new int[grid.length][grid[0].length];
        for(int[] a : dp){
            Arrays.fill(a, -1);
        }
        return min(grid, 0,0, dp);
    }
    public static int min(int[][] grid, int cr, int cc,int[][] dp){
        int m = grid.length;
        int n = grid[0].length;
       
        //out of boundry--
        if(cr >= m || cc >= n){
            return 0;
        }
        // obstacle condtion--
        if(grid[cr][cc] == 1){
            return 0;
        }
         // destination basec 
         if(cr == m-1  && cc == n-1){
            return 1;
        }

       //dp apply--
       if(dp[cr][cc] != -1){
        return dp[cr][cc];
       }
       
        int down  = min(grid, cr+1, cc, dp); 
        int right = min(grid, cr, cc+1, dp);
            
        
       
        return dp[cr][cc] =  down+right; // remember in table dp

    }
}