class Solution {
    public String reversePrefix(String word, char ch) {
      int fir = word.indexOf(ch);
        if (fir== -1) {
            return word;
        }

        StringBuilder sb = new StringBuilder(word.substring(0, fir + 1));
        return sb.reverse().toString() + word.substring(fir + 1);   
    }
}