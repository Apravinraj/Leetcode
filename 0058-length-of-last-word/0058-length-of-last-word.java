class Solution {
    public int lengthOfLastWord(String s) {
        s.trim();
        String [] strArr = s.split(" ");
        String str = strArr[strArr.length-1];
        return str.length();
    }
}