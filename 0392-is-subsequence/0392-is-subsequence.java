class Solution {
    public boolean isSubsequence(String s, String t) {
        int index = -1;
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            char ch = arr[i];
            if((index < t.indexOf(ch)) && (t.indexOf(ch)>-1)){
            index = t.indexOf(ch);
            t = t.substring(index+1);
            index = -1;
            System.out.println(t);
            }
            else{
            return false;
        }
        }
        
    return true;
    }
}