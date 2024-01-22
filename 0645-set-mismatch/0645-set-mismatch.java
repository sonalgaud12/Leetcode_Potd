class Solution {
    public int[] findErrorNums(int[] nums) {
      int sum1 = 0;
   int sum2 = 0;
   int square1 = 0;
   int square2 = 0;
   int gap1 = 0;
   int gap2 = 0;
   for (int i = 1; i<=nums.length;i++){
       sum1+=i;
       square1+=i*i;
   }
   for (int i = 0; i<nums.length;i++){
       sum2+=nums[i];
       square2+=nums[i]*nums[i];
   }
   gap1 = Math.abs(sum1-sum2);
    gap2 = Math.abs(square1-square2);
    int a = (gap1+(gap2/gap1))/2;
    int b = a-gap1;
    int[] res = new int[2];
    if (sum1-sum2<0){
        res[0] = a;
        res[1] = b;
    }else {
        res[0] = b;
        res[1] = a;
    }

    return res;  
    }
}