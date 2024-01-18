class Solution {
    
    private int solve(int n, int[] term){
        if(n<0) return 0;
        if(n==0) return 1;
        if(term[n] != -1) return term[n];
        
        int oneStep = solve(n-1,term);
        int twoStep = solve(n-2,term);
        
        return term[n] = oneStep+twoStep;
    }
    
    public int climbStairs(int n) {
        int [] term = new int[n+1];
        Arrays.fill(term,-1);
        return solve(n,term);
        
    }
}