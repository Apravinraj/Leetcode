class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int start = nums[0];

        for(int i=1;i<=nums.length;i++){
            if(i == nums.length || nums[i] != nums[i-1] +1 ){
                if(start == nums[i-1]) list.add(String.valueOf(start));
                else{list.add(start+"->"+nums[i-1]);}
                if (i < nums.length) start = nums[i];
 
            }
        }

        return list;
    }
}