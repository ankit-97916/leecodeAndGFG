class Solution {
    public int lengthOfLongestSubstring(String s) {
        return length(s);
    }
    public static int length(String s){
        HashMap<Character, Integer> map =  new HashMap<>();
        int i= 0;
        int j = 0;
        int maxLength = 0;
      while(j < s.length()){
          char ch = s.charAt(j);
          map.put(ch, map.getOrDefault(ch , 0 )+1); // update answer-- 
          if(map.size() == j-i+1){
            maxLength =  Math.max(maxLength, j-i+1);
            j++;
          }else{
            while(map.size() < j-i+1){
                char remove =  s.charAt(i);
                map.put(remove, map.get(remove)-1); 

                if(map.get(remove) == 0){
                    map.remove(remove);
                }
                i++;
            }
            j++;
          }

      }
        return maxLength;
    }
}