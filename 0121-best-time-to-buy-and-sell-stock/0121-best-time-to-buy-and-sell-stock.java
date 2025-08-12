class Solution {
    public int maxProfit(int[] arr) {
        int min = Integer.MAX_VALUE;
        int Profit = 0;
       for(int i =0;i<arr.length ;i++){
       if(arr[i] < min){
        min =arr[i];
       }

       else if((arr[i] - min) > Profit){
        Profit = arr[i] - min;
       }
        }
       
       return Profit;
    }
}