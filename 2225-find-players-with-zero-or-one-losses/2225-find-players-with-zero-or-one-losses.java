/*
Question link: https://leetcode.com/problems/find-players-with-zero-or-one-losses/
Time Complexity: O(n*logn)
Space Complexity: O(n)
*/

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
/*
Question Breakdown: 
The questions says we will be given an array of matches[i] in which the 0th index will be of winner and !st index will be of loser
 matches[i] = [winner[i], loser[i]]

In this we have to return two list following the conditions:
1. List of the players who have not lost an single match
2. List of the players who have lost exactly one match
The values in the two lists should be returned in increasing order.

Approach: As we can see we have to maintain the count of the players who never lost or lost excatly onces
In that case we will just make an map to make a count of the lost players and how many times they have lost
then we will make two list, one for the winner and one for the players who lost excatly once

As soon we can check in the map of the count we will push back the values in to the given list.
But what if someone wins the game twice? will to add them in the winner list twice? 
eg: Input: matches = [[1,3],[2,3],[3,6],[5,6],[5,7],[4,5],[4,8],[4,9],[10,4],[10,9]]
Output: [[1,2,10],[4,5,7,8]]
we can see 10 is winning twice but mentioned once in the winner list

Answer: No, to handle this testcase we will just add winning number who occurs twice in the map,
to excape from the duplicate values.
 






*/
