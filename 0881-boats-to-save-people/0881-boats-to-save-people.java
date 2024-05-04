class Solution {
    public int numRescueBoats(int[] people, int limit) {
      Arrays.sort(people); 

        int left = 0;
        int right = people.length - 1;
        int boat_count = 0;

       
        while (left <= right) {
            int sum = people[left] + people[right];
            if (sum <= limit) {
                boat_count++;
                left++;
                right--;
            } else {
                boat_count++;
                right--;
            }
        }
        return boat_count;   
    }
}