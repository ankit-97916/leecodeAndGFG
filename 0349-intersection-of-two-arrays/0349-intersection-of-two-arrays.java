class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        List<Integer>  ans = new ArrayList<>();
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    if(!ans.contains(arr1[i])){
                        ans.add(arr1[i]); 
                    }
                     arr2[j] = -1;
                        break;
                }
            }
        }

        int[] res =  new int[ans.size()];

        for(int i=0; i<ans.size(); i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}