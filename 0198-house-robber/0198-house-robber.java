class Solution {
    public int rob(int[] arr) {
      if(arr.length == 1){
        return arr[0];
      }

      int dp[] =  new int[arr.length];
      dp[dp.length-1] = arr[arr.length-1];
      dp[dp.length-2] = Math.max(arr[arr.length-1], arr[arr.length-2]); 

      for(int i=dp.length-3; i>=0; i--){
        int rob1 =  arr[i] + dp[i+2];
        int rob2 = dp[i+1];
        dp[i] = Math.max(rob1, rob2);
      }
      return dp[0] ;
       
    }
}