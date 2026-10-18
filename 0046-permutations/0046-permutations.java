class Solution {
    public List<List<Integer>> permute(int[] arr) {
         List<List<Integer>> ans = new ArrayList<>();
         List<Integer> li = new ArrayList<>();
         arrangement(arr, 0, ans, li);
         return ans;

        
    }

    public static void arrangement(int[] arr, int idx,  List<List<Integer>> ans,  List<Integer> li ){
          if(idx == arr.length){
            ans.add(new ArrayList<>(li));
            return;
          }

          //arr.lenght = recurssicve calls;
          for(int i = idx; i<arr.length; i++){
           swap(arr, idx , i);
           li.add(arr[idx]);
           arrangement(arr, idx+1, ans, li);
           li.remove(li.size()-1);
            swap(arr, idx , i);

          }
    }

    public static void swap(int[] arr, int i, int j){
           int temp = arr[i];
           arr[i]  = arr[j];
           arr[j] = temp;
    }
}