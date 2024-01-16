class RandomizedSet {
    
    private ArrayList<Integer> list;
    private HashMap<Integer, Integer> map;
    private Random random;
    

    public RandomizedSet() {
        
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
        
    }
    
    public boolean insert(int value) {
         if (map.containsKey(value)) {
            return false;
         }
        list.add(value);
        map.put(value, list.size() - 1);
        return true;
        
    }
    
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
    
    public int getRandom() {
        
        int index = random.nextInt(list.size());
        return list.get(index);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */