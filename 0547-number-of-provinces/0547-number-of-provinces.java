class Solution {
    public int findCircleNum(int[][] isConnected) {
        HashSet<Integer> visit = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
         int n = isConnected.length;
         int count = 0;
         for(int i=0; i<n; i++){
            if(visit.contains(i)){
                continue;
            }
            count++;
            q.add(i);
            while(!q.isEmpty()){
                // remove---
                int remove =  q.poll();
                // ignores
                if(visit.contains(remove)){
                    continue;
                }
                //visited mark-
                visit.add(remove);
                // self work-
                for(int j=0; j<n; j++){
                    if(isConnected[remove][j] == 1 && !visit.contains(j)){
                        q.add(j);
                    }
                }
            }
         }
         return count;
              
    }
   
}