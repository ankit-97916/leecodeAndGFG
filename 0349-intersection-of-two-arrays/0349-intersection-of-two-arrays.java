class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       return  intersectionArray(nums1, nums2);
    }

    public static int[] intersectionArray(int[] arr1, int[]arr2){
        HashMap<Integer, Integer> map =  new HashMap<>();
        ArrayList<Integer> list =  new ArrayList<>();
        
        //store array 1 element in map --- 

        for(int i = 0; i < arr1.length; i++){
            map.put(arr1[i], map.getOrDefault(arr1[i], 0)+1);
        }
        //
        for(int i = 0; i< arr2.length; i++){
            if(map.containsKey(arr2[i])  && map.get(arr2[i]) > 0){
               if(!list.contains(arr2[i])){
                 list.add(arr2[i]);
               }
                 map.put(arr2[i], map.get(arr2[i])-1);
            }

           
        }

        int[] ans = new int[list.size()] ;
        for(int i = 0; i<list.size(); i++){
            ans[i] =  list.get(i);
        }

        return ans;


    }
}