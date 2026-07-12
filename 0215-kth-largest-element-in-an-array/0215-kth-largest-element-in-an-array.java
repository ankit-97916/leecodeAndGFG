class Solution {
    public int findKthLargest(int[] arr, int k) {
       return largeK(arr, k); 
    }

    public static int largeK(int[] arr, int k){
        // min heap for max-
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // by default min-
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]); // make a heap size of k --

            if(pq.size() > k){
                pq.poll();
            }

        }
        return pq.poll();
    }
}