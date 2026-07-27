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
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        //
        for(int i=2; i<dp.length; i++){
            int rob = arr[i] + dp[i-2];
            int dontrob = dp[i-1];
             dp[i] = Math.max(rob, dontrob);
        }

        return dp[dp.length-1];
       
        
     



    }

}