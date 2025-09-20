class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while(n!=1 && !seen.contains(n)){
            int sum =0;
            seen.add(n);
            while(n>0){
                int digit = n%10;
                sum+=digit*digit;
                n/=10;
            }
            n= sum;
        }
        if(n == 1) return true;
        else return false;
    }
}