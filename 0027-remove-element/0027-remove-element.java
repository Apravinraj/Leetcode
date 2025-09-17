class Solution {
    public int removeElement(int[] nums, int val) {
        int searcher =0,holder=0;
       for(searcher = 0;searcher< nums.length;searcher++){
        if(nums[searcher] != val){
            nums[holder] = nums[searcher];
            holder++;
        }
       }

       return holder;
    }
}