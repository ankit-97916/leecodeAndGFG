class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
        
         List<Integer> li = new ArrayList<>();
       
        for(int i=0; i<arr1.length; i++){
            for(int j= 0; j<arr2.length; j++){
                if(arr1[i] ==  arr2[j]){
                 li.add(arr1[i]);
                 arr2[j] = -1;
                 break;
                }
            }
        }
     int[] res  = new int[li.size()];
     for(int i=0; i<li.size(); i++){
        res[i] = li.get(i);
    }
    return res;
}
}