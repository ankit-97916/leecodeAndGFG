class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ll = new ArrayList<>();

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
                if(!ll.contains(arr2[i])){
                    ll.add(arr2[i]);
                }
                map.put(arr2[i] , map.get(arr2[i]) -1);
            }
        }
        //
        int[] ans = new int[ll.size()];
        for(int i=0; i<ll.size(); i++){
            ans[i] = ll.get(i);
        }

        return ans;
        
        
    }
}