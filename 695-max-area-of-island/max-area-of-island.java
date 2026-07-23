class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols =  grid[0].length;
        boolean[][] visit = new boolean[rows][cols]; // vist track
        Queue<int[]> q = new LinkedList<>();// bfs
        int area = 0; //total area--
        //check every cell--
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
              if(grid[i][j] == 1 && !visit[i][j]){
               int currentArea = 0;
                visit[i][j] = true;
                q.add(new int[]{i,j});

                while(!q.isEmpty()){
                    int[] remove =  q.poll();
                    int row = remove[0];
                    int col = remove[1];
                    currentArea++;

                    //up
                    if(row-1 >=0 && grid[row-1][col] == 1 && !visit[row-1][col]){
                        visit[row-1][col] = true;
                        q.add(new int[]{row-1, col});
                    }
                    // down
                     if(row+1 <rows && grid[row+1][col] == 1 && !visit[row+1][col]){
                        visit[row+1][col] = true;
                        q.add(new int[]{row+1, col});
                    }

                    // left
                     if(col-1 >= 0 && grid[row][col-1] == 1 && !visit[row][col-1]){
                        visit[row][col-1] = true;
                        q.add(new int[]{row, col-1});
                    }

                    // left
                     if(col+1 < cols && grid[row][col+1] == 1 && !visit[row][col+1]){
                        visit[row][col+1] = true;
                        q.add(new int[]{row, col+1});
                    }
                }
                area = Math.max(area, currentArea);
              }
            }
        }
        // 
        return area;
    }
}