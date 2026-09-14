class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        sub(arr, 0, li, ans);
        return ans;

    }
    public static void sub(int[]arr, int i, List<Integer> li, List<List<Integer>> ans  ){
          if(i == arr.length){
            ans.add(new ArrayList<>(li));
            return;
          }
       
     li.add(arr[i]); // include
     sub(arr, i+1, li, ans);
     li.remove(li.size()-1); // backtrack ---
     sub(arr, i+1, li, ans);
    }
}