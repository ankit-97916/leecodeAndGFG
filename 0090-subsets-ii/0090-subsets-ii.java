class Solution {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
         List<Integer> li = new ArrayList<>();
         sub(arr, 0 , ans, li);
         return ans;

        
    }
    public void sub(int[] arr, int i , List<List<Integer>> ans , List<Integer> li ){
        if(i == arr.length){
            ans.add(new ArrayList<>(li));
            return;
        }

        li.add(arr[i]);
        sub(arr, i+1, ans, li);
        li.remove(li.size()-1);//explicit backtracking;
        //handle duplctae  -- 
        int next = i+1;
        while(next < arr.length && arr[next] ==  arr[i]){
            next++;
        }
        sub(arr, next, ans, li);
    }
}