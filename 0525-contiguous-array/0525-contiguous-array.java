class Solution {
    public int findMaxLength(int[] nums) {
      int[] ind = new int[nums.length * 2 + 1];
        Arrays.fill(ind, -2);
        ind[nums.length] = -1;
        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            count += nums[i] == 0 ? -1 : 1;
            if(ind[nums.length + count] >= -1){
                max = Math.max(max, i - ind[nums.length + count]);
            } else {
                ind[nums.length + count] = i;
            }
        }
        return max; 
    }
}