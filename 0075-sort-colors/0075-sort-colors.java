class Solution {
    public void sortColors(int[] arr) {
        
        int start=0,end = arr.length-1;
        int i=0;
        while(i<=end){
            if(arr[i] == 0){
                swap(arr,i,start);
                start++;
            }
            else if(arr[i] == 2){
                swap(arr,i,end);
                end--;
                i--;
            }
            i++;
        }
        
    }

    void swap(int[] arr ,int i ,int start){
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;
    }
}