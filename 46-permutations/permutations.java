class Solution {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> result  = new ArrayList<>();
        List<Integer>  li = new ArrayList<>();
        arrangment(arr, 0, result , li);
        return result;

    }

    public static void arrangment(int[] arr, int idx,  List<List<Integer>> result ,List<Integer>  li ){
          if(idx == arr.length){
            result.add(new ArrayList<>(li));
            return;
          }

          for(int i = idx; i < arr.length; i++){
            swap(arr, idx, i);
            li.add(arr[idx]);
           arrangment(arr, idx+1 , result , li);
           li.remove(li.size()-1);
           swap(arr, idx , i);
          }
    }

    // swap fn ---
    public static void swap(int[] arr,  int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;
    }
}