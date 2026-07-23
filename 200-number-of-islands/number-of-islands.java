class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visit = new boolean[rows][cols];
        Stack<int[]> q = new Stack<>();
        int island = 0;
        // check all cells;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j] == '1' && !visit[i][j]){
                    island++;
                    // start bfs = ;
                    visit[i][j] = true;
                    q.push(new int[]{i,j});
                    while(!q.isEmpty()){
                        // remove row and col extract--
                        int[] remove = q.pop();
                        int row = remove[0];
                        int col = remove[1];

                        // add up 
                        if(row-1 >= 0 && grid[row-1][col] == '1' && !visit[row-1][col]){
                            visit[row-1][col] = true;
                            q.push(new int[]{row-1,col});
                        }

                         // add down 
                        if(row+1 <rows && grid[row+1][col] == '1' && !visit[row+1][col]){
                            visit[row+1][col] = true;
                            q.push(new int[]{row+1,col});
                        }

                         // add left 
                        if(col-1 >= 0 && grid[row][col-1] == '1' && !visit[row][col-1]){
                            visit[row][col-1] = true;
                            q.push(new int[]{row,col-1});
                        }

                        //  // add right----- 
                        if(col+1 <cols && grid[row][col+1] == '1' && !visit[row][col+1]){
                            visit[row][col+1] = true;
                            q.push(new int[]{row,col+1});
                        }
                    }
                }
            }
        }
        // return 
        return island;
        
    }
}