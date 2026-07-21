class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        //make a graph-----
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }

    
    // add edges
    for( int i=0; i<edges.length; i++){
        int v1 = edges[i][0];
        int v2 = edges[i][1];
        graph.get(v1).add(v2);
        graph.get(v2).add(v1);
    }
    // hashset for tracking--
    HashSet<Integer> visit = new HashSet<>();
    Queue<Integer> q = new LinkedList<>();
    q.add(source);
    // bfs 
    while(!q.isEmpty()){
        //remove -
        int remove = q.poll();
        //ignore-
        if(visit.contains(remove)){
            continue;
        }
        //   add mark
        visit.add(remove);
        // self work-
        if(remove == destination){
            return true;
        }
        // add unvisted neighbours-
        for(int nbrs : graph.get(remove)){
            if(!visit.contains(nbrs)){
                q.add(nbrs);
            }
        }
    }
    return false;
}
    }