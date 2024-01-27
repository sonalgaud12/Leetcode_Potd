/* 
Time Complexity: O(n)
Space COmplexity: O(1)
 */


var twoSum = function(nums, target) {
    
    let mp = new Map()
    
    for (let i = 0; i < nums.length; i++) {
        let diff = target - nums[i]
        
        if (mp.has(diff)) {
            return [i, mp.get(diff)]
        }
        
        mp.set(nums[i], i)
    }
    
};

/*
Question Breakdown: Given an array of integers nums and an integer target 
we just need to find two numbers prsent in the array which comes to target

Approach: Using the brute force approach we could just keep two variables but that time complexity would be O(n^2)
to optimise the solution we can just use hashmap
In which it will store the value with index 
and we will create a difference that will be target - num
and if map has the difference values then we will put the ith index and rhe difference in the map
*/
