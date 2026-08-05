class Solution {
    public int maxVowels(String s, int k) {
        return maxVowel(s, k);
    }

    public static int maxVowel(String s , int k){
        int i= 0;
        int j = 0;
        int count = 0;
        int maxCount = 0;
        while(j < s.length()){
            //calculate answer
            char ch =  s.charAt(j);
            if(ch == 'a' || ch == 'e' || ch == 'i' ||  ch == 'o' || ch == 'u'){
                count++;
            }
            // maintainr window--
            if(j-i+1 < k){
                j++;
            }
            // when widow full-
           else if(j-i+1 == k){
                maxCount = Math.max(count, maxCount);
            
            // remove from  window startinf index--
            char remove = s.charAt(i);
            if(remove == 'a' || remove == 'e' || remove == 'i' ||remove == 'o' ||remove == 'u' ){
                count--;
            }
            // slide the window 
            i++;
            j++;

            }
        }
        return maxCount;
    }
}