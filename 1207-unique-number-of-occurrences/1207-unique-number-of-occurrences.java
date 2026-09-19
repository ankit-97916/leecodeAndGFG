class Solution {
    public boolean uniqueOccurrences(int[] array) {
        // count frequncy of evevery element - - - -
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int arr : array){
            map.put(arr, map.getOrDefault(arr,  0)+1);
        }

        HashSet<Integer>  set = new HashSet<>();
        for(int frequency : map.values()){
            if(set.contains(frequency)){
                return false;
            }

            set.add(frequency);
        }

        return true;


    }
}