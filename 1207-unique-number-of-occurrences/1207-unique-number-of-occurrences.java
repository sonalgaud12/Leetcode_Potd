/*
Time complexity: O(n)
Space complexity: O(1)
*/


class Solution {
    public boolean uniqueOccurrences(int[] arr) {
    
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Store frequency of each number
        for (int number : arr) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int frequency : map.values()) {
            if (set.contains(frequency)) {
                return false;
            }
            set.add(frequency);
        }
        
        return true;
    }
}


/*
Question breakdown: 
As stated in the question that we will be given a array inn which there will be numbers 
we have the count the occurance of an individual number if the occurance value is unique 
then we can return true else return false

Approach: As we see we need the number as well as the value of their occurance we can simply assume 
HashMAp. we will count and store, later creat a set to store the frequency of the number
if all the frequency is unique then will return true or else false.


*/
