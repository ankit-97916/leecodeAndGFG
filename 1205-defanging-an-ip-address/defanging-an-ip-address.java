class Solution {
    public String defangIPaddr(String s) {
        StringBuilder str  = new StringBuilder();
        for(int i =0; i<s.length(); i++){
          if(s.charAt(i) == '.'){
            str.append("[.]");
          }else{
            str.append(s.charAt(i));
          }
        }

        return str.toString();
    }
}