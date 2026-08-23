class Solution {
    public int orangesRotting(int[][] grid) {
        int rows  = grid.length;
        int cols = grid[0].length;
        Queue<Pair> q = new LinkedList<>();//for bfs---
        //count fres ornage ;
        int freshOranges = 0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                // rotten oranges add in que
             if(grid[i][j] == 2){
               q.add(new Pair(i, j));
             }
             //count fres ornage ;
             if(grid[i][j] == 1){
                  freshOranges++;
             }
            }
        }
        // timing to rooten orange 
        int time  = 0;
        while(!q.isEmpty() && freshOranges > 0){
         //size of que =  process rotten simutaniously---
         int size = q.size();
         for(int i=0; i<size; i++){
         Pair remove =  q.poll();
         int row  =  remove.row;
         int col =  remove.col;

         // directions--
         //up
         if(row-1 >= 0 && grid[row-1][col] == 1){
            grid[row-1][col]= 2;
            freshOranges--;
            q.add(new Pair(row-1, col));

         }

          //down
         if(row+1 < rows && grid[row+1][col] == 1){
            grid[row+1][col] = 2;
            freshOranges--;
            q.add(new Pair(row+1, col));

         } //right
         if(col+1 < cols && grid[row][col+1] == 1){
            grid[row][col+1]= 2;
            freshOranges--;
            q.add(new Pair(row, col+1));

         } //left
         if(col-1 >= 0 && grid[row][col-1] == 1){
            grid[row][col-1]= 2;
            freshOranges--;
            q.add(new Pair(row, col-1));

         } 
         } 
         time++;
        }
         if(freshOranges > 0){
            return -1;
         }
        return time;

    }
    class Pair{
        int row;
        int col;
        Pair(int row , int col){
            this.row = row;
            this.col = col;
        }
    }
}