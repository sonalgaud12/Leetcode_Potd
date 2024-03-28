class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        int i = 0;
        int j = 0;
        int result = 0;

        while (j < n) {
            mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1); 
            while (i < j && mp.getOrDefault(nums[j], 0)> k) { 
                mp.put(nums[i], mp.get(nums[i]) - 1); 
                if (mp.get(nums[i]) == 0) {
                    mp.remove(nums[i]);
                }
                i++; 
            }
            result = Math.max(result, j - i + 1); 
            j++; 
        }
        return result;
    }
}