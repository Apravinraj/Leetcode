class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false; 
        HashMap<Character, Character> hm1 = new HashMap<>(); 

        for(int i = 0 ; i < s.length() ; i++){
            if(hm1.containsKey(s.charAt(i))){
                if(hm1.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
            else if (hm1.containsValue(t.charAt(i))) {
                return false;
            }
            else{
                hm1.put(s.charAt(i),t.charAt(i));
            }
        }

        // for(int i = 0 ; i < t.length() ; i++){
        //     if(hm2.containsKey(t.charAt(i))){
        //         if(hm2.get(t.charAt(i))!=s.charAt(i)){
        //             return false;
        //         }
        //     }
        //     else{
        //         hm2.put(t.charAt(i),s.charAt(i));
        //     }
        // }
        return true;
    }
}