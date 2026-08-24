class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    int rows = image.length;
    int cols = image[0].length;
    int oldColor = image[sr][sc];// staring index is oldcolor ya original color ---
     if(oldColor == color){
            return image;
        }
    Stack<Pair> st = new Stack<>();
    st.push(new Pair(sr, sc));
    while(!st.isEmpty()){
        //remove----
        Pair remove = st.pop();
        int row = remove.row;
        int col =  remove.col;

        //change color and visit mark ek sath-- depend on questions---
        image[row][col] = color;

        // add valid neighbour in stack ----
        if(row-1 >= 0 && image[row-1][col] == oldColor){
            st.push(new Pair(row-1, col));
        }
         if(row+1 < rows && image[row+1][col] == oldColor){
            st.push(new Pair(row+1, col));
        }
         if(col-1 >= 0 && image[row][col-1] == oldColor){
            st.push(new Pair(row, col-1));
        }
         if(col+1 < cols && image[row][col+1] == oldColor){
            st.push(new Pair(row, col+1));
        }

    }
    return image;
    
    }
    
    //
   
}