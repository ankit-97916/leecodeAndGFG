class Solution {
    public int removeDuplicates(int[] arr) {
        ArrayList<Integer>  li = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(!li.contains(arr[i])){
                li.add(arr[i]);
            }
        }
        for(int i=0; i<li.size(); i++){
            arr[i] = li.get(i);
        }
        return li.size();
    }
}