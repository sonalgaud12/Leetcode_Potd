class Solution {
    public boolean isIsomorphic(String s, String t) {
     if(s == null || t == null && s.length() != t.length()) return false;
        
        Map<Character, Character> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++){  
            char str1 = s.charAt(i), str2 = t.charAt(i);  
            if (mp.containsKey(str1)){  
                if (mp.get(str1) != str2)  
                    return false;  
            }else{  
                if (mp.containsValue(str2))            
                    return false;  
                mp.put(str1, str2);  
            }  
        }  
        return true;  
    }
}