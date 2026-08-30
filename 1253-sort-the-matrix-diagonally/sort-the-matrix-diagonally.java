class Solution {
    public int[][] diagonalSort(int[][] mat) {
       int m = mat.length;
       int n  =  mat[0].length;
       for(int j=0; j<n; j++){
        sortOneDiagonal(mat, 0, j );
       }
       for(int i=1; i<m; i++){
        sortOneDiagonal(mat, i , 0);
       }
       return mat;
    }

    public static void sortOneDiagonal(int[][] matrix, int row, int col){
        int m =  matrix.length;
        int n =  matrix[0].length;
        // length of diagonal 
        int length = 0;
        int i =row;
        int j =  col;
        while(i < m && j < n){
            length++;
            i++;
            j++;
        }

        // make diagonal size array to chage sort the  alue 
        int[] diagonal =  new int[length];
         i = row;
       int index = 0;
         j = col;
        while(i < m && j < n){
            diagonal[index] = matrix[i][j];
            index++;
            i++;
            j++;
        }
        // sort the diagonal array ---
        Arrays.sort(diagonal);
        // put back balues in matrix ---
         i = row;
         j  = col;
         index  = 0;
        while(i < m && j < n){
            matrix[i][j] =  diagonal[index];
            index++;
            i++;
            j++;
        }
    }
}