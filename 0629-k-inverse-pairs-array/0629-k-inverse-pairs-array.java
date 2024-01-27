/*
Time Complexity: O(n * k^2)
Space Complexity: O(n * k)
*/

class Solution {
    public int kInversePairs(int n, int k) {
      int mod = 1000000007;

// Check for invalid values of k
if (k > n*(n-1)/2 || k < 0) return 0;

// Base cases
if (k == 0 || k == n*(n-1)/2) return 1;

// 2D array to store intermediate results
long[][] dp = new long[n+1][k+1];

// Base case for n=2
dp[2][0] = 1;
dp[2][1] = 1;

// Populate dp array using dynamic programming
for (int i = 3; i <= n; i++) {
    dp[i][0] = 1;
    
    for (int j = 1; j <= Math.min(k, i*(i-1)/2); j++) {
        // Calculate dp[i][j] based on the recurrence relation
        dp[i][j] = dp[i][j-1] + dp[i-1][j];
        
        // Adjust for the case when j is greater than or equal to i
        if (j >= i) dp[i][j] -= dp[i-1][j-i];
        
        // Take modulo to prevent overflow
        dp[i][j] = (dp[i][j] + mod) % mod;
    }
}

// Return the result
return (int) dp[n][k];

    }
}

/*
Question breakdown: We are given two integers, n and k.
We need to find the number of different arrays consisting of numbers from 1 to n such that there are exactly k inverse pairs.
An inverse pair is defined as a pair of integers [i, j] where 0 <= i < j < nums.length and nums[i] > nums[j].

Approach: The initial checks handle the cases where k is not within a valid range, returning 0 for such cases.
The base cases are handled for k equal to 0 or n*(n-1)/2, returning 1.
The 2D array dp is used to store the intermediate results.
The nested loops iterate over i and j to populate the dp array based on the recurrence relation.
The calculation of dp[i][j] takes into account the contributions from the previous row (dp[i-1][j]) and adjusts for the case when j is greater than or equal to i.
The result is returned as (int) dp[n][k] after taking modulo 10^9 + 7.


*/
