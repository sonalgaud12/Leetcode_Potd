class Solution {
    public int knightDialer(int n) {
        int mod = 1000000007;
       long[] dp = new long[10];
        long[] current = new long[10];
        Arrays.fill(dp, 1); // because n >= 1 and thus we can atleast dial every single key once
        
		// Here we need to calculate the total number of keys we can jump on, from each individual key, as a chess knight
		// For example, consider the case when we want to reach key 1 as a knight from somewhere on the keypad. A knight can move in all the 8 directions. 
		// So we can reach key 1, from keys 6 and 8 only (L shaped move) (Please check the knight movement rules from wikipedia or refer to the image given in the problem description)
	    // The total number of ways from which we can reach key 1 as a knight is equal to total number of ways in which we can reach keys 6 and 8.
		
        for(int i = 0; i < n - 1; i++) {
		
            current[0] = (dp[4] + dp[6]) % mod;
            current[1] = (dp[6] + dp[8]) % mod; // as explained in the above comments. Key 1 can be jumped on, from keys 6 and 8 only as a Knight
           current[2] = (dp[7] + dp[9]) % mod;
            current[3] = (dp[4] + dp[8]) % mod;
            current[4] = (dp[3] + dp[9] + dp[0]) % mod;
            current[5] = 0; // No L shaped move possible on key 5
            current[6] = (dp[1] + dp[7] + dp[0]) % mod;
            current[7] = (dp[2] + dp[6]) % mod;
            current[8] = (dp[1] + dp[3]) % mod;
            current[9] = (dp[2] + dp[4]) % mod;
            
			// Now we store the current result in the dp array and use the stored values in the next iteration
			// These will be the total number of ways we can reach every key from every other key in the ith iteration
            dp = current;
            current = new long[10];
			
        }
        
        long ans = 0;
        for(long num : dp) {
            ans = (ans + num) % mod;
        }
        
        return (int)ans;  
    }
}