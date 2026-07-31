class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];

        Arrays.fill(dp, -1);

        return climb(n, dp);
    }
    public static int climb(int n, int[] dp ){
        if(n == 1 || n == 2){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }

       int step1 =  climb(n-1, dp);
       int step2 =  climb(n-2, dp);
       return dp[n] =  step1+step2;
    }
}