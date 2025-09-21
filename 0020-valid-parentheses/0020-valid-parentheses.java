class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        stk.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);

            if(stk.isEmpty()) stk.push(ch);
            else if(ch == '}' && stk.peek()=='{'){
                 stk.pop();
            }
            else if(ch == ']' && stk.peek()=='['){
                 stk.pop();
            }
            else if(ch == ')' && stk.peek()=='('){
                 stk.pop();
            }
            else{
            stk.push(ch);
        }
        }

        if(stk.isEmpty()) return true;
        return false;
    }
}