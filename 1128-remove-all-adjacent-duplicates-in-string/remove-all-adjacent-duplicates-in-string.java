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

        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            char ch = st.peek();
            st.pop();
            res.append(ch);
        }
        return res.reverse().toString();
    }
}