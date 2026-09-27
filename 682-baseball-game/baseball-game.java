class Solution {
    public int calPoints(String[] operations) {
        return points(operations);
    }
    public static int points(String[] arr){
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<arr.length; i++){
            if(arr[i].equals("C")){
                st.pop();
            }else if(arr[i].equals("D")){
                st.push(st.peek()*2);
            }else if(arr[i].equals("+")){
                int last = st.pop();
                int slast =  st.peek();
                int sum = last + slast;
                st.push(last);
                st.push(sum);
            }else{
                //normal nuber-
                st.push(Integer.parseInt(arr[i]));
            }
        }

        int ans =  0;
        while(!st.isEmpty()){
            ans += st.pop();
        }
        return ans;
    }
}