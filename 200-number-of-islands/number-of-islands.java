class Solution {
    public int numIslands(char[][] grid) {
        int rows =  grid.length;
        int  cols  = grid[0].length;
        Stack<Pair> st = new Stack<>();
        boolean visited[][] = new boolean[rows][cols];
        int islands = 0;
        for(int i=0; i<rows;i++){
            for(int j= 0; j<cols; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                   islands++;

                   st.push(new Pair(i, j));
                   while(!st.isEmpty()){
                    //remove--
                    Pair remove =  st.pop();
                    int row = remove.row;
                    int col =  remove.col;
                    //ignore--
                    if(visited[row][col]){
                        continue;
                    }
                    //  mark --
                    visited[row][col] = true;

                    // addunvisited--------
                    if(row-1 >= 0 && grid[row-1][col] ==  '1' && !visited[row-1][col]){
                        st.push(new Pair(row-1, col));
                    }

                      if(row+1 < rows && grid[row+1][col] ==  '1' && !visited[row+1][col]){
                        st.push(new Pair(row+1, col));
                    }
  if(col-1 >= 0 && grid[row][col-1] ==  '1' && !visited[row][col-1]){
                        st.push(new Pair(row, col-1));
                    }
  if(col + 1 < cols && grid[row][col+1] ==  '1' && !visited[row][col+1]){
                        st.push(new Pair(row, col+1));
                    }


                   }
                }
            }
        }
        return islands;
    }
    class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row =  row;
            this.col = col;
        }
    }
}