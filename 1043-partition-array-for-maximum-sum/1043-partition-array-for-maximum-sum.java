class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
      int n = arr.length;
        int[] dp = new int[n];
        dp[n-1] = arr[n-1];
        for (int i = n - 2; i >= 0; i--) {
            int max = arr[i];
            dp[i] = max + dp[i+1];
            for (int j = i + 1; j - i < k && j < n; j++) {
                max = Math.max(max, arr[j]);
                dp[i] = Math.max(dp[i], max * (j - i + 1) + (j + 1 >= n ? 0 : dp[j+1]));
            }
        }
        return dp[0];   
    }
}