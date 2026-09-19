class Solution {
    public boolean exist(char[][] arr, String word) {
         for(int i=0; i<arr.length; i++){
            for(int j =0; j<arr[0].length; j++){
                if(arr[i][j] == word.charAt(0)){
                    boolean ans = exit(arr, i,j, word, 0);
                    if(ans){
                        return true;
                    }
                }
            }
         }
         return false;
    }

    public static boolean exit(char[][] arr , int cr, int cc, String word , int i){
        int n = arr.length; 
        int m = arr[0].length;
        if( i == word.length()){
            return true;
        }
        if(cr < 0 || cc <  0 || cr >=n || cc >= m || arr[cr][cc] != word.charAt(i) ){
            return false;
        }

                         arr[cr][cc] = '&';
        boolean found =  exit(arr,  cr+1 , cc , word, i+1) ||
                         exit(arr,  cr , cc+1 , word, i+1) ||
                         exit(arr,  cr-1 , cc , word, i+1) ||
                         exit(arr,  cr , cc-1 , word, i+1) ;
                         arr[cr][cc] = word.charAt(i);
                         return found;

    }
}