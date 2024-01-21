/*
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int rob(int[] nums) {
      int even = 0;
      int odd = 0;
        // keeping the values as zero

        for (int i = 0; i < nums.length; i++) {
            // as we know if the adjacent houses is lotted we will be caughted 
            // we will count the maximun amount from even and odd.
            if (i % 2 == 0) {
                even = Math.max(even + nums[i], odd);
            } else {
                odd = Math.max(odd + nums[i], even);
            }
        }
        // we will just return the max value
        return Math.max(even, odd);  
    }
}
/*
Question Breakdown: We are robbing houses, we have the return the maximum amount
the only catch is if we loot the adjacent houses then we will get caught

Approach: As we only dont have to move adjacent houses, then will simply iterative in odd and even
and we will sum and return the max amount.
*/

