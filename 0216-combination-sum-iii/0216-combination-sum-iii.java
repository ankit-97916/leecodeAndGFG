class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
                List<Integer> li = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        rangeCombination(k, n, 0, 0,  1, li, ans );
        return ans;

        
    }

        public static void rangeCombination(int k , int n , int currSum, int currK  ,int idx , List<Integer> li,  List<List<Integer>> ans ){
        if(currK == k && currSum == n){
           ans.add(new ArrayList<>(li));
            return;
        }
        if(currSum > n){
            return;
        }

        for(int i=idx; i<=9; i++){
            li.add(i);
            rangeCombination(k, n, currSum+i, currK+1 , i+1, li, ans);
            li.remove(li.size()-1); // back track
        }

}
}