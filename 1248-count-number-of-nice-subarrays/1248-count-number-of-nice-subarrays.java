class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
       int n = nums.length;
        int[] cnt = new int[n + 1];
        cnt[0] = 1;
        int ans = 0, t = 0;
        for (int num : nums) {
            t += num & 1; // 0+1 1+1 2+1
            if (t - k >= 0) { // 1-3 2-3 3-3
                ans += cnt[t - k]; // 1 + 1+0
            }
            cnt[t]++; //1 2 3
        }
        return ans; //2
        
    }
}

