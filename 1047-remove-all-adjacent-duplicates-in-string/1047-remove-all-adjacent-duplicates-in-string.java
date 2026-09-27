class Solution {
    public String removeDuplicates(String s) {
        return remove(s);
    }

    public String remove(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            if(!st.isEmpty() && st.peek() == s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }

        String res =  "";
        while(!st.isEmpty()){
            char ch = st.peek();
            st.pop();
            res += ch;
        }
        String ans  = "";
        for(int i=res.length()-1; i>=0; i--){
            ans += res.charAt(i);
        }
        return ans;
    }
}