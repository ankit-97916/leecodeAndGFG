class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        printCombhinationSum(arr ,target, 0,  0, ans,result);
        return result;

        
    }

     public static void printCombhinationSum(int[] arr, int target, int idx, int sum,List<Integer> ans,   List<List<Integer>> result ){
        
             if(sum == target){
                 //  base case
                 result.add(new ArrayList<>(ans));
            // System.out.println(ans);
            return;
        }

        if(sum > target){ // base case--
            return;
        }

       HashSet<Integer> set = new HashSet<>();
        for(int j=idx; j<arr.length; j++){
            if(set.contains(arr[j])){
                continue;
            }
            set.add(arr[j]);
            ans.add(arr[j]);
        printCombhinationSum(arr ,target, j+1 ,sum+arr[j], ans, result);
        ans.remove(ans.size()-1);

            }
        }
}