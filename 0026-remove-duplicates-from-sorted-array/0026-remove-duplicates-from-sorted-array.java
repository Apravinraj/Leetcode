class Solution {
    public int removeDuplicates(int[] nums) {
        int holder=1;
        for(int searcher = 1;searcher< nums.length;searcher++){
            if(nums[searcher] != nums[searcher-1]){
                nums[holder++] = nums[searcher];
            }
        }

        return holder;
    }
}