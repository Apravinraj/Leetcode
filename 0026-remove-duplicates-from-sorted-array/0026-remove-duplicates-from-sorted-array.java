class Solution {
    public int removeDuplicates(int[] arr) {
        
       int selected = 1, holder = 1;
       for(selected =1;selected<arr.length;selected++){
        if(arr[selected] != arr[selected-1]){
            arr[holder] = arr[selected];
            holder++;
        }
       }
       return holder;
    }
}