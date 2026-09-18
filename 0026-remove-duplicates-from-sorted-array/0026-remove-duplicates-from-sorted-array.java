class Solution {
    public int removeDuplicates(int[] arr) {

        ArrayList<Integer>  li = new ArrayList<>();// O(n) space arrayList
        for(int i=0; i<arr.length; i++){ //O(n)
            if(!li.contains(arr[i])){// conayins O(n);
                li.add(arr[i]);
            }
        }
        for(int i=0; i<li.size(); i++){
            arr[i] = li.get(i);
        }
        return li.size();
    }
}