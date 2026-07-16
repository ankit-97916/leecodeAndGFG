class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
         HashMap<Integer, Integer> map = new HashMap<>();
         List<Integer> li = new ArrayList<>();
         for(int i=0; i<arr1.length; i++){
            int n = arr1[i];
            if(map.containsKey(n)){
              map.put(n, map.get(n) + 1);
            }else{
                map.put(n, 1);
            }
         }

         //traverse second loop-
         for(int i=0; i<arr2.length; i++){
            if(map.containsKey(arr2[i]) && map.get(arr2[i]) > 0){
                li.add(arr2[i]);
                map.put(arr2[i], map.get(arr2[i])-1);
            }
         }
         // 
         int[] ans = new int[li.size()];
         for(int i=0; i<li.size(); i++){
            ans[i] = li.get(i);
         }
         return ans;
        
}
}