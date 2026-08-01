class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int[] a : dp){
            Arrays.fill(a, -1);
        }
        return minPath(grid, 0 , 0, dp);
    }

    public static int minPath(int[][] grid, int cr, int cc, int[][] dp){
        // base case -- reach destination --
        if(cr == grid.length-1 && cc == grid[0].length-1){
            return grid[cr][cc];
        }
        // base case-- range k bhar 
        if(cr >= grid.length || cc >= grid[0].length){
            return Integer.MAX_VALUE;
        }

        if(dp[cr][cc] != -1){
            return dp[cr][cc];
        }
         //increase rows
        int down =  minPath(grid, cr+1, cc, dp );
        //increae cols
        int right =  minPath(grid, cr, cc+1 , dp);

        return dp[cr][cc] =  grid[cr][cc] + Math.min(right, down);

    }
}