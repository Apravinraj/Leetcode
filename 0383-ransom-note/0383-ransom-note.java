class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for(int i=0;i<magazine.length();i++){
           arr[magazine.charAt(i) - 'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            int sea = ransomNote.charAt(i) - 'a';
            if(arr[sea] == 0) return false;
            else{
                arr[sea]--;
            }
        }
        return true;
    }
}