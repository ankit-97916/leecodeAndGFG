class Solution {
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
         subsetDuplictae(arr, 0, li, ans);
         return ans;

    }

    public static void subsetDuplictae(int[] arr, int i, List<Integer> li, List<List<Integer>> ans){
        if(i == arr.length){
            ans.add(new ArrayList<>(li));
            return;
        }

        li.add(arr[i]);
        subsetDuplictae(arr, i+1, li, ans);
        li.remove(li.size()-1);// backtracking  
        int next =  i+1;
        while(next < arr.length && arr[next] == arr[i]){
            next++;
        }
         subsetDuplictae(arr, next, li, ans);



    }
}