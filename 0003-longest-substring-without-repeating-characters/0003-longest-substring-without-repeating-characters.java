class Solution {
    public int lengthOfLongestSubstring(String s) {
         return longestSubstring(s);
    }
    public static int longestSubstring(String s ){
        // hashmap to store unique characters ----
        HashMap<Character, Integer > map =  new HashMap<>();
        int i = 0; // left side of window---
        int j  = 0; // right side of window  ---
        int maxlength = 0; //initilaize the value of longest substring ---

        // sliing window pattern 
        while(j < s.length()){
            // addcurrent element --
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch , 0) + 1);
            if(j-i+1 == map.size()){
                maxlength =  Math.max(maxlength, j-i+1);
            }else { // widow  j-i+1 > map.size
             while(  map.size() < j-i+1){
                char remov = s.charAt(i);
                map.put(remov, map.get(remov)-1);


                if(map.get(remov) == 0){
                 map.remove(remov);
                }
               i++;
             }
            
            }
             j++;
            
        }

        return maxlength;



    }
}