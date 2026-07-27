class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        return climbCount(n,  dp); 
    }
    // 
    public static int climbCount(int n ,  int[] dp){
        if(n  <= 2){
            return n;
        }
        //------------
        // if(i > n){
        //     return 0;
        // }
        //--
        if(dp[n] != 0){
            return dp[n];
        }
        int climb = climbCount(n-1, dp);
        int dclimb = climbCount(n-2 ,  dp);
        return dp[n] =  climb+dclimb;
    }

 
}