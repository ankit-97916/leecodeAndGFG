class Solution {
    public int rob(int[] arr) {
        // int dp[]  = new int[arr.length];
        // for(int i=0; i<dp.length; i++){
        //     dp[i] = -1;
        // }
        // Arrays.fill(dp, -1);
        return robhouse(arr);
        
    }
    public static int robhouse(int[] arr){
        if(arr.length == 1){
            return arr[0];
        }
        //
        int[] dp = new int[arr.length];
        dp[dp.length-1] = arr[arr.length-1];
        dp[dp.length-2] = Math.max(arr[arr.length-1], arr[arr.length-2]);
        //
        for(int i=dp.length-3; i>=0; i--){
            int rob = arr[i] + dp[i+2];
            int dontrob = dp[i+1];
             dp[i] = Math.max(rob, dontrob);
        }

        return dp[0];
       
        
     



    }

}