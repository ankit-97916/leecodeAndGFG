class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        return fibo(n, dp); 
    }

 public static int fibo( int n , int[] dp){
  if(n <= 2){
    return n;
  }
  //
  if(dp[n] != 0){
    return dp[n];
  }

  int x = fibo(n-1 , dp);
  int y = fibo(n-2, dp);
  return dp[n] =  x+y;
}
}