class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int [] dp = new int[s.length()];
        Arrays.fill(dp , -1);
         return isWord(s, wordDict, 0, dp);
    }

    public static boolean isWord(String s , List<String> wordDictionary, int i, int[] dp){
        if(i == s.length()){
            return true;
        }

        if(dp[i] != -1){  // apply dp
          if(dp[i] == 1){
            return true;
          }else{
           return false;
          }
            
        }
        //
        for(int j=i+1; j<=s.length(); j++){
            String word  = s.substring(i, j);
            if(wordDictionary.contains(word)){
                boolean ans = isWord(s, wordDictionary, j, dp);
                if(ans){
                    dp[i] = 1; // store do i table
                    return true;
                }
            }
        }
        dp[i] = 0;
        return false;
    }
}