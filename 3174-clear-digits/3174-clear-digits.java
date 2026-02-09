class Solution {
    public String clearDigits(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z') stk.push(ch);
            else stk.pop();
        }
        StringBuilder sb = new StringBuilder();
        for(char ch:stk){
            sb.append(ch);
        }
        return sb.toString();
    }
}