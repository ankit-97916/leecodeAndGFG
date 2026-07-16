class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> ll = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i], map.get(arr1[i]) + 1);
            }else{
                map.put(arr1[i], 1);
            }
        }
        //
        for(int i=0; i<arr2.length; i++){
            if(map.containsKey(arr2[i]) && map.get(arr2[i]) > 0){
                
                    ll.add(arr2[i]);
                
                map.put(arr2[i] , map.get(arr2[i]) -1);
            }
        }
        //
        int[] ans = new int[ll.size()];
        int i=0;
        for(Integer num : ll){
            ans[i] = num;
            i++;
        }

        return ans;
        
        
    }
}