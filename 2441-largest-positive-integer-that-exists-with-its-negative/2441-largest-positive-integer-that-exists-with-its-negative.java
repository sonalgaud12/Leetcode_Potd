class Solution {
    public int findMaxK(int[] nums) {
      HashSet<Integer> hq = new HashSet<>();
        int ans = -1;
        for(int num : nums){
            hq.add(num);
            int k = num*(-1);
            if(hq.contains(k)){
                ans = Math.max(ans,Math.abs(num));
            }
        }
        return ans;   
    }
}