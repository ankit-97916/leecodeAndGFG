class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        return fibo(n); 
    }

 public static int fibo( int n){
    // int[] dp = new int[n+1]; 
  if(n <= 2){
    return n;
  }
  //
  int prev1 =1;
  int prev2 =1;
  for(int i=2; i<=n; i++){
   int c= prev1+prev2;
   prev1 = prev2;
   prev2 = c;
  }
  return prev2;
}
}