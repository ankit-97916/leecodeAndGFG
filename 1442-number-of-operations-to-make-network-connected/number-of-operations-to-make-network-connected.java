class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length < n-1){
            return -1;
        }

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }
        // add edges--
        for(int i=0; i<connections.length; i++){
            int v1 = connections[i][0];
            int v2 = connections[i][1];
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        int operations = 0;
        for(int i=0; i<n ; i++){
            if(visited.contains(i)){
                continue;
            }
            operations++;
            q.add(i);
            while(!q.isEmpty()){
                // remove--
                int remove =  q.poll();
                if(visited.contains(remove)){
                    continue;
                }
                //
                visited.add(remove);

                for(int nbrs : graph.get(remove)){
                    if(!visited.contains(nbrs)){
                        q.add(nbrs);
                    }
                }
            }
        }
        return operations-1;
    }
}