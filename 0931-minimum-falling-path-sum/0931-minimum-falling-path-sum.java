class Solution {
    public int minFallingPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int[] a : dp){
            Arrays.fill(a, -999999);
        }
        int ans = Integer.MAX_VALUE;

        for(int j= 0; j<grid[0].length; j++){
            ans = Math.min(ans, minFall(grid, 0, j, dp ));
        }

        return ans;
    }
    public static int minFall(int[][] grid, int cr, int cc, int[][] dp){
        //base case out of range--

        if(cc < 0 || cr >= grid.length || cc >= grid[0].length){
            return Integer.MAX_VALUE;
        }
        // base case destination --
        if(cr == grid.length-1){
            return grid[cr][cc];
        }
            // apply dp
            if(dp[cr][cc] != -999999){
                return dp[cr][cc];
            }
        // choices--
        int left = minFall(grid, cr+1, cc-1, dp);
        int right = minFall(grid, cr+1, cc+1, dp);
        int down = minFall(grid, cr+1, cc, dp);

        return dp[cr][cc] =  Math.min(left, Math.min(right, down) ) +  grid[cr][cc];

    }
}