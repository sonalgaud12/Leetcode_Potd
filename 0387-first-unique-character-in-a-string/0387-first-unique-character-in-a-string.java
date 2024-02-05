class Solution {
    public int firstUniqChar(String s) {
      
         HashMap<Character, Integer> mapp = new HashMap<>();

        for (char a : s.toCharArray()) {
            mapp.put(a, mapp.getOrDefault(a, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (mapp.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
        
    
    }
}