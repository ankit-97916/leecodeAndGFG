class Solution {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length];
        Stack<Integer>  st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=arr2.length-1; i>=0; i--){
            while(!st.isEmpty() &&  st.peek() <= arr2[i] ){
                st.pop();
            }

            if(st.isEmpty()){
                map.put(arr2[i] , -1);
            }else{
               map.put(arr2[i], st.peek());
            }
            st.push(arr2[i]);
        }
        //
        for(int i=0; i<arr1.length; i++){
            ans[i] = map.get(arr1[i]);
        }
        return ans;
    }
}