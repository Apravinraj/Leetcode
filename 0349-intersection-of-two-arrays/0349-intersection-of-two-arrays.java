class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums1){
            list.add(ele);

        }
        for(int itr:nums2){
            if(list.contains(itr)){
            set.add(itr);
            }
        }

        int[] resarr = new int[set.size()];
        int i=0;
        for(int ele : set){
            resarr[i++] = ele;
        }
        return resarr;
    }
}