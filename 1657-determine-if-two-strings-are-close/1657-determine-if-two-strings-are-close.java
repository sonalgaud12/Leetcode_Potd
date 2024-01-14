/* Time Complexity: O(n)
   Space Complexity: O(26) - O(1)
*/


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

/* 
Question Breakdown
After reading the question we could identify that we will be given two strings
we have to check that those are considered close or not using following rules
- Either we can tranform word1 to make it similar to word2
- or we swap them.

Intuition:
we can simply assume that both of the strings need to be equal.
Then we can check the frequency of each alphabet.
if the above two cases match then we can perform the further code.
*/

