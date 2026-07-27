class Solution {
    public int rob(int[] arr) {
        int dp[]  = new int[arr.length];
        Arrays.fill(dp, -1);
        return robhouse(arr, 0, dp);
        
    }
    public static int robhouse(int[] arr , int i, int[] dp){
        if(i >= arr.length){
            return 0;
        }
        //
        if(dp[i] !=  -1){
            return dp[i];
        }

        
      int rob = arr[i] + robhouse(arr, i+2, dp);
    int dontrob =  robhouse(arr, i+1, dp);

    return dp[i] =  Math.max(rob, dontrob);



    }

}