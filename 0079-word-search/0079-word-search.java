class Solution {
    public boolean exist(char[][] arr, String word) {
         for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == word.charAt(0)){
                    boolean ans = isExist(arr, i,j,word, 0);
                    if(ans){
                        return true;

                    }
                }
            }
         }
         return false;
    }
    public static boolean isExist(char[][] arr, int cr , int cc, String word, int idx){
        if(idx == word.length()){
            return true;
        }

        if(cr < 0 || cc < 0 || cr >= arr.length || cc >= arr[0].length || arr[cr][cc] != word.charAt(idx)){
            return false;
        }
            arr[cr][cc] = '*';
        boolean found = isExist(arr, cr+1, cc , word ,idx+1) ||
                        isExist(arr, cr-1, cc , word ,idx+1) ||
                        isExist(arr, cr, cc+1 , word ,idx+1) ||
                        isExist(arr, cr, cc-1 , word ,idx+1);
            arr[cr][cc] = word.charAt(idx);
            return found;


    }
}