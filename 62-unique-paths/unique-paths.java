class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp =  new int[m][n];

        for(int[] a : dp){
            Arrays.fill(a , -1);
        }
         return unique(m ,n, 0,0, dp);
    }
    public static int unique(int m , int n, int cr, int cc, int[][] dp){
        if(cr == m-1  && cc == n-1){
            return 1;
        }
        //
        if(cr >= m || cc >= n){
            return 0;
        }
     if(dp[cr][cc] != -1){
        return dp[cr][cc]; // apply dp
     }
        int down = unique(m, n, cr+1, cc, dp); 
         int right = unique(m, n, cr, cc+1, dp); 
         return dp[cr][cc] = down+right; // remember in table dp

    }
}