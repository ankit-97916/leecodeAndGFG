class Solution {
    public boolean isSameAfterReversals(int num) {
        if(reverse(num) == num){
            return true;
        }
        return false;
    }

    public static int reverse(int n){
        int rev = 0;
        while(n > 0){
         int lastdigit = n%10;
         rev = rev*10+lastdigit;
         n = n/10;

        }
        int revnum =  rev;
        int ans = 0;
        while(revnum > 0){
            int last =  revnum%10;
            ans = ans*10+last;
            revnum = revnum/10;
        }
        return ans;
    }
}