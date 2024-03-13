class Solution {
    public int pivotInteger(int n) {
        
        int lsum =0, rsum=0;
        
        for(int i=1;i<=n;i++){
            lsum = i*(i+1)/2;
            rsum = n*(n+1)/2-i*(i-1)/2;
            
            if(rsum == lsum)
            return i;
        }
        return -1;
        
        
    }
}