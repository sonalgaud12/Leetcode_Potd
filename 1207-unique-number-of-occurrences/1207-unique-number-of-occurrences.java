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