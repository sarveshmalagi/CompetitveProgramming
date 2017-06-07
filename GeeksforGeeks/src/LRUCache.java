import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author ssm
 *
 */

//Donot use this approach in interview
//implement a doubly linked list and use a hashmap
//Just for reference
//http://www.geeksforgeeks.org/implement-lru-cache/
/*You are required to complete below class */
class LRUCache {
    private LinkedHashMap<Integer, Integer> map;
    private final int CAPACITY;
    
    /*Inititalize an LRU cache with size N */
    public LRUCache(int N) {
        CAPACITY = N;
        map = new LinkedHashMap<Integer, Integer>(CAPACITY, 0.75f, true){
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > CAPACITY;
            }
        };
    }
    
    /*Returns the value of the key x if 
     present else returns -1 */
    public int get(int key) {
       return map.getOrDefault(key, -1);
    }
    
    /*Sets the key x with value y in the LRU cache */
    public void set(int key, int value) {
        map.put(key, value);
    }
}