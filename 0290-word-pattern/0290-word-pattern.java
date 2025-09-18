class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] sArr = s.split(" ");
        if(pattern.length() != sArr.length) return false;


        HashMap<Character,String> hm = new HashMap<>();
       
        for(int i=0;i<pattern.length();i++)
        {
            char ch = pattern.charAt(i);
            String w = sArr[i];
            if(hm.containsKey(ch))
            {
                if(!hm.get(ch).equals(w)) return false;
               }
                else{
                    if(hm.containsValue(w)) return false;
                    hm.put(ch,w);
                    
                }
        }
            return true;
    }
}