class Solution {
    public int maxVowels(String s, int k) {
        return maxcount(s, k);
    }

    public static int maxcount(String s, int k ){
        int i = 0;
        int j = 0;
        int count = 0;
        int max = 0 ;

        while(j <s.length()){
            // addd current character--
            if(isVowel(s.charAt(j))){
                count++;
            }

            if(j-i+1 < k ){ // increse window size---
                j++;
            }

            else if(j-i+1 == k){
                max = Math.max(max, count);

             // remove  i 
            if(isVowel(s.charAt(i))){
                count--;
            }
             i++;
            j++;

            }
           
           
        }
        return max;
    }
    public static boolean isVowel(char ch){
        return ch == 'a'|| ch == 'e' || ch == 'i' ||ch == 'o' ||ch == 'u';
    }
}