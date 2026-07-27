class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        return climbCount(n, 0, dp); 
    }
    // 
    public static int climbCount(int n , int i, int[] dp){
        if(i == n){
            return 1;
        }
        //------------
        if(i > n){
            return 0;
        }
        //--
        if(dp[i] != 0){
            return dp[i];
        }
        int climb = climbCount(n ,i+1, dp);
        int dclimb = climbCount(n , i+2, dp);
        return dp[i] =  climb+dclimb;
    }

 
}