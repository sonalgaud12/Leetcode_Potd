class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
      Map<Integer, Integer> Lost_Count = new HashMap<>();
       // creating an map to store the number who have lost and also the value of how many times
        
        for(int[] iteration : matches){
            int Lose = iteration[1];
            Lost_Count.put(Lose,Lost_Count.getOrDefault(Lose, 0)+1);
            //  To get specified value with the specified key in this map, if not then the getorDefault operation will provide a default value if it is not present in the map 
        }
        
        
        List<Integer> ZeroLost = new ArrayList<>();
        List<Integer> OneLost = new ArrayList<>();
        // Creating two List to maintain the count of how many have never lost and how many have lost only once
        
        for(int[] iteration: matches){
            int Won = iteration[0];
            int Lose = iteration[1];
            // iterating towrads the 0th & 1st index as stated in the question
            
            if(!Lost_Count.containsKey(Won)){
                ZeroLost.add(Won);
                Lost_Count.put(Won, 2); //  Adding the winning number in the map to escape from the duplicate values
            } 
            
            if(Lost_Count.get(Lose) == 1){
                OneLost.add(Lose);
            } // If in the map we found a number only containing an single lost then we will push back it to OneLost list
            
        }
        Collections.sort(ZeroLost);
        Collections.sort(OneLost);
        // Sorting the List using collection frame work operation cause we have to return the list in INCREASING order.
        
        return Arrays.asList(ZeroLost,OneLost);
        // returing the list as Oth index for the win and !st index for excatly one lost
        
        
    }
}