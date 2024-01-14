class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        
        if(n1 != n2) return false;
        
        int[] fq1 = new int[26];
        int[] fq2 = new int[26];
        
        for(int i=0;i<n1;i++){
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);
            
            fq1[c1 -'a']++;
            fq2[c2 -'a']++;
        }
        
        for(int i=0;i<26;i++){
            if((fq1[i] !=0 && fq2[i] !=0) || (fq1[i] ==0 && fq2[i] == 0))
                continue;
            
            return false;
        }
        
        Arrays.sort(fq1);
        Arrays.sort(fq2);
        
        return Arrays.equals(fq1, fq2);
        
        
    }
}