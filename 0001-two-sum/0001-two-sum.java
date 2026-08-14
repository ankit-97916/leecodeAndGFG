class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            int needed = target - arr[i];// 
            if(map.containsKey(needed)){
                return new int[] {map.get(needed), i};
            }

            map.put(arr[i], i);


        }
        return new int[]{};
    }
}