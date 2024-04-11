class Solution {
    public String removeKdigits(String num, int k) {
       char[] arr = num.toCharArray();
        StringBuilder n = new StringBuilder();
        
        int right = 0;
        int left = 0;
        while(k < arr.length) {
            while( right <= k) {
                if (arr[left] > arr[right]) {
                    left = right;
                }
                right++;
            }
            n.append(arr[left]);
            left++; k++; right=left;
        }

        while(n.indexOf("0")==0) {
            n.delete(0,1);
        }
         if (n.length() == 0) {
            return "0";
        }
       
        return new String(n);  
    }
}