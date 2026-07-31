class Solution {
    public int rob(int[] arr) {
        // int n = arr.length;
        // int[] dp = new int[n];
        // Arrays.fill(dp, -1);
        return chor(arr);
        
    }
    public static int chor(int[] arr){
        if(arr.length == 1){
            return arr[0];
        }
       int[] dp = new int[arr.length];

       dp[0] =  arr[0];
       dp[1] =  Math.max(arr[0], arr[1]);
       ////
       for(int i=2; i<dp.length; i++){
       int rob = arr[i] + dp[i-2];
       int dont = dp[i-1];

       dp[i] =  Math.max(rob, dont);
       }
       return dp[arr.length-1];

    }
}