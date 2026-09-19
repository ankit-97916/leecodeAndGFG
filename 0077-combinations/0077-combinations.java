class Solution {
    public List<List<Integer>> combine(int n, int k) {
         List<List<Integer>> ans = new ArrayList<>();
         List<Integer> li = new ArrayList<>();
         combination(n , 1, k, ans, li);
         return ans;
    }

    public static void combination(int n, int i , int k ,List<List<Integer>> ans, List<Integer> li){
        if(li.size() == k){
            ans.add(new ArrayList<>(li));
            return;
        }
        if(li.size() > k){
            return;
        }
        //
        for(int j=i; j<=n; j++){
            li.add(j);
            combination(n, j+1, k, ans, li);
            li.remove(li.size()-1);
        }
    }
}