class Solution {
    public class BipertitePair{
        int vertex;
        int distance;
        public BipertitePair(int vertex, int distance){
            this.vertex =  vertex;
            this.distance =  distance;
        }
    }
    public boolean isBipartite(int[][] graph) {
        Queue<BipertitePair> q = new LinkedList<>();
        HashMap<Integer, Integer> visited  = new HashMap<>();

        for(int key = 0; key < graph.length; key++){
            if(visited.containsKey(key)){
                continue;
            }
            q.add(new BipertitePair(key, 0));
            // bfs shuru;
            while(!q.isEmpty()){
                // remove --
                BipertitePair rmPair = q.poll();
                // ignore--
                if(visited.containsKey(rmPair.vertex)){
                    if(visited.get(rmPair.vertex) != rmPair.distance){
                        return false;
                    }
                    continue;
                }
                // add mark;
                visited.put(rmPair.vertex, rmPair.distance);
                // self work---nothing--
                // add unvisted nbrs;;
                for(int nbrs : graph[rmPair.vertex] ){
                    if(!visited.containsKey(nbrs)){
                        q.add(new BipertitePair(nbrs, 1 - rmPair.distance ) );
                    }
                }
            }

        }
        return true;
    }
    

}