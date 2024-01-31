class Solution {
    public boolean judgeSquareSum(int c) {
        
        long start=0;
         long end = (long)Math.sqrt(c); 
        // type casting to manage the value of sqaure root
        
        // if the start is less tham end
        while(start<=end){
            // if the start^2+end^2=c question solved
            if(start*start+end*end==c){
                return true;
            }else if(start*start+end*end<c)
                // else we will check is it less than c
                start++; 
            // we will increment the start
            else 
                end--;
            // else we will decrement the end
            
        }
        return false;
        
    }
}