class Solution {
    public List<List<Integer>> permute(int[] arr) {

                
       List<List<Integer>> result = new ArrayList<>();
        printPermutaionOfArray(arr, 0, result);
        return result;

        
    }

        public static void printPermutaionOfArray(int[] arr, int idx ,  List<List<Integer>> result){
      if(idx == arr.length){
       List<Integer> temp = new ArrayList<>();
       for(int num : arr){
        temp.add(num);
       }
       result.add(temp);
        
        return;
      }
      // take curent elemnt
      for(int i=idx; i<arr.length; i++){
        // swap
        swap(arr, i, idx);
        //rc
        printPermutaionOfArray(arr, idx+1 ,result);
        //undo bt
        swap(arr, i, idx);
      }
    }
  
       // swa the elmnt -
    public static void swap(int[] arr , int i, int j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }

}