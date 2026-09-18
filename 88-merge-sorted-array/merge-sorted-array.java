class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> li = new ArrayList<>();//spcae O(n)
        for(int i=0; i<m; i++){
            li.add(nums1[i]);
        }

        for(int i=0; i<n; i++){
            li.add(nums2[i]);
        }
      Collections.sort(li);
        for(int i =0; i<li.size(); i++){
            nums1[i] = li.get(i);
        }
    }
}