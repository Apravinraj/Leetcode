class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int temp =x;
        int rev = 0;
        int place =10;
        while(x>0){
            int digit = x%10;
            rev=rev*place+digit;
            x/=10;
        }

        if(temp == rev) return true;
        return false;
    }
}