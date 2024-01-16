/*
Question link: https://leetcode.com/problems/insert-delete-getrandom-o1/
Time Complexity: O(1)
Space Complexity: O(1)

*/

class RandomizedSet {
    
    private ArrayList<Integer> list;
    private HashMap<Integer, Integer> map;
    private Random random;

    // Initialize your data structure here.
    public RandomizedSet() {
        
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
        
    }

    // Inserting a value to the list. Returns true if the list did not already contain the specified element.
    public boolean insert(int value) {
         if (map.containsKey(value)) {
            return false;
         }
        list.add(value);
        map.put(value, list.size() - 1);
        return true;
        
    }

    // Removing a value from the list. Returns true if the list contained the specified element
    public boolean remove(int value) {
        if (!map.containsKey(value)) {
            return false;
        }
        int index = map.get(value);
        int lastElement = list.get(list.size() - 1);
        list.set(index, lastElement);
        map.put(lastElement, index);
        list.remove(list.size() - 1);
        map.remove(value);
        return true;
        
    }
    // getting a random element from the list
    public int getRandom() {
        
        int index = random.nextInt(list.size());
        return list.get(index);
        
    }
}

/*
Question Breakdown: Simply the question states that there is an RandomizedSet() Initializes the RandomizedSet object.
There are different methods given like bool insert(int value),bool remove(int value),int getRandom()
In the *insert method* we have to write the code in such a say if a number is present then return false, 
if not present then insert and return true.
In *remove method* bascially checking if the number present,if there then remove and return true else false
In *getRandom* we have to return any random number which is present in the set

Approach: As the main challenge comes is that we need to write code in O(1).
If we approach it through vector the insert and getRandom method would work in O(1) 
but the remove method take O(n).
So the another approach we will go is to map( cause we can store the element with index in map)
so we will set an set and a map to store the numbers.

Then we will write operations according to the need

*/
