/* Time Complexity: O(n)
   Space Complexity: O(26) - O(1)
*/


class Solution {
    public boolean closeStrings(String word1, String word2) {
        int word1_length = word1.length();
        int word2_length = word2.length();
        
        if(word1_length != word2_length) return false; // if the size is not equal that means it is not the true
        
        int[] frequency1 = new int[26];
        int[] frequency2 = new int[26];
       // storing the frequency of alphabet
        
        for(int loop=0;loop < word1_length;loop++){
            char character1 = word1.charAt(loop);
            char character2 = word2.charAt(loop);
           // iterating over the characters 
            
            frequency1[character1 -'a']++;
            frequency2[character2 -'a']++;
           //expression subtracts the ASCII value of the character 'a' from the ASCII value of the character.
        }
        
        for(int loop=0;loop<26;loop++){
            if((frequency1[loop] !=0 && frequency2[loop] !=0) || (frequency1[loop] ==0 && frequency2[loop] == 0))
                continue;
           // if the iteration follows the conditions then the loop will continue
            
            return false;
        }
        
        Arrays.sort(frequency1);
        Arrays.sort(frequency2);
       // sorting both the array to get the clear form of the strings
        
        return Arrays.equals(frequency1, frequency2);
        // returning the array
        
        
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

