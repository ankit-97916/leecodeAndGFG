class Solution {
    public List<List<String>> partition(String s1) {

         List<String> li = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        allPartition(s1,  li , ans);
        return ans;

        
    }

        public static void allPartition(String s1, List<String> li, List<List<String>> ans){
        if(s1.length() == 0){
            
            ans.add(new ArrayList<>(li));
            return;
        }

        for(int j=1; j<=s1.length(); j++){
            String s = s1.substring(0,j);
            // check palindrome sunstring
            if(isPalindrome(s)){
                li.add(s);
            allPartition(s1.substring(j),  li, ans); 
            li.remove(li.size()-1); 
            }
       }
    }

    // check palindrome or not
    public static boolean isPalindrome(String s1){
        int i =0;
        int j = s1.length()-1;
         while(i < j){
            if(s1.charAt(i) != s1.charAt(j)){
                return false;
            }
            i++;
            j--;
         }
         return true;

        
    } 

}