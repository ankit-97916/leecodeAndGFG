class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int i = s1.length();
        int j =  s2.length();

        int[][] dp =  new int[i][j];
        for(int[] a : dp){
            Arrays.fill(a, -1);
        }
        return  longestSubSequence(s1,s2, i-1, j-1, dp);
    }
    public static int longestSubSequence(String s1, String s2, int i , int j ,int[][] dp ){
        if(i < 0 || j < 0){
            return  0;
        }
       //apply dptopdown apprach--

       if(dp[i][j] != -1){
        return dp[i][j];
       }
        // condition--
        int add = 0;
        if(s1.charAt(i) == s2.charAt(j)){
             add = 1+ longestSubSequence(s1,s2, i-1, j-1, dp);
        }

        int left =   longestSubSequence(s1,s2, i-1, j, dp);
        int right =  longestSubSequence(s1,s2, i, j-1, dp);
        return dp[i][j] =  Math.max(add, Math.max(left, right));
    }
}