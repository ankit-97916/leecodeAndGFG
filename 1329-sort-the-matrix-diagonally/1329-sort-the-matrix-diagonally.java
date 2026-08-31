class Solution {
    public int[][] diagonalSort(int[][] mat) {
        for(int j=0 ; j< mat[0].length; j++){
            sortOneDiagonal(mat, 0, j);
        }

        for(int i=1 ; i< mat.length; i++){
            sortOneDiagonal(mat, i, 0);
        }
        return mat;
    }
    public static void sortOneDiagonal(int[][] mat , int   row, int col ){
        int m = mat.length;
        int n = mat[0].length;
        int i =row;
        int j= col;
        int length = 0;
        // length---
        while(i < m && j < n){
            length++;
            i++;
            j++;
        }

        int[]  diagonal = new int[length];

        i=row;
        j = col;
        int index = 0;
        while(i < m && j < n){
       diagonal[index] = mat[i][j];
       index++;
       i++;
       j++;
        }
       // sort the diagonal
       Arrays.sort(diagonal);
        i = row;
        j =  col;
        index  =0;
        while(i < m && j <  n){
            mat[i][j] =   diagonal[index];
            index++;
            i++;
            j++;
        }
    }
}