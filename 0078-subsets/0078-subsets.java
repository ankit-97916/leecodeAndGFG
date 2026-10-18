class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li =  new ArrayList<>();
        sub(arr, 0 ,ans, li);
        return ans;
        
    }
    public static void  sub(int[] arr , int i ,List<List<Integer>> ans , List<Integer> li ){
        if(i == arr.length){
            ans.add(new ArrayList<>(li));
            return;
        }

        //add
        li.add(arr[i]);
        sub(arr, i+1, ans, li);
        li.remove(li.size()-1);// explicit backtrack - -- 
        sub(arr, i+1, ans, li);
    }
}