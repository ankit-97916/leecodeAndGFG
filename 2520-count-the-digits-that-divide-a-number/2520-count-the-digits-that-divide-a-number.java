class Solution {
    public int countDigits(int num) {
        
       int count = 0;
       int x  = num ;
       while(num > 0){
        int last = num%10;

        if(last != 0 && x % last == 0){
            count++;
        }
        num = num/10;

       } 
       
       return count;
    }
}