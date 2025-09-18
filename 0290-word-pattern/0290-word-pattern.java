class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] sArr = s.split(" ");
        if(pattern.length() != sArr.length) return false;


        HashMap<Character,String> hm = new HashMap<>();
        Set<String> used = new HashSet<>();
        
        for(int i=0;i<pattern.length();i++)
        {
            char ch = pattern.charAt(i);
            String w = sArr[i];
            if(hm.containsKey(ch))
            {
                if(!hm.get(ch).equals(w)) return false;
               }
                else{
                    if(used.contains(w)) return false;
                    hm.put(ch,w);
                    used.add(w);
                }
        }
            return true;
    }
}