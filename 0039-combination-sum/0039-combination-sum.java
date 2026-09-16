class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>  li = new ArrayList<>();
        combination(arr, 0 , target, li,ans, 0);
        return ans;

    }

    public static void combination(int[] arr, int currSum, int target,List<Integer>  li,List<List<Integer>> ans , int idx ){
          if(currSum == target){
            ans.add(new ArrayList<>(li));
            return;
          }

          if(currSum > target){
            return;
          }

          for(int i=idx; i<arr.length; i++){
            li.add(arr[i]);
            combination(arr , currSum+arr[i], target, li ,ans, i);
            li.remove(li.size()-1);
          }
    }
}