/*
Question Link: https://leetcode.com/problems/climbing-stairs/
Time Complexity: O(n)
Space Complexity: O(1)
*/
// Recursive + Memoization
class Solution {
    // creating a function
   private int solve(int number, int[] term) {
    // Base case: If the number of stairs is less than 0, there are no ways to climb.
    if (number < 0) return 0;
    
    // Base case: If there are 0 stairs, there is only one way (doing nothing).
    if (number == 0) return 1;
    
    // If the result for the current number of stairs has already been calculated,
    // return the stored result to avoid redundant computations.
    if (term[number] != -1) return term[number];
    
    // Recursive step: Calculate the number of ways to climb the stairs
    // by taking one step or two steps at a time, and store the result.
    int oneStep = solve(number - 1, term);
    int twoStep = solve(number - 2, term);
    
    // Store the result for the current number of stairs and return the sum.
    return term[number] = oneStep + twoStep;
}

// Public method to calculate the number of ways to climb stairs.
// Initializes the array for storing intermediate results and calls the solve method.
public int climbStairs(int number) {
    // Array to store intermediate results for dynamic programming.
    int[] term = new int[number + 1];
    
    // Initialize the array with -1 to indicate that results have not been calculated yet.
    Arrays.fill(term, -1);
    
    // Call the solve method to get the final result.
    return solve(number, term);
}
        
    }
}

/* 
Question Breakdown: You are climbing a staircase. It takes n steps to reach the top.
Either we can take 1 step or 2 step and have to return In how many distinct ways can you climb to the top?

Approach : We can use approach but the optimised one is to use memo 

*/
